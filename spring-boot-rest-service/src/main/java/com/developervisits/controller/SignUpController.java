package com.developervisits.controller;

import com.developervisits.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1")
public class SignUpController {

  @Autowired
  MessageSource source;

  public ResponseEntity<String> signup(@RequestBody User user) {
    //service.save()
    int id = 123; //userId that got saveed you can return as a path
    URI uri = ServletUriComponentsBuilder.
      fromCurrentContextPath().
      path("/{id}").
      buildAndExpand(id).toUri();

    return ResponseEntity.created(uri).build();

  }


  //HATEOAS  hypermedia as the engine of application state
  @GetMapping("/retriveAllUsers")
  public List<User> retriveAllUsers() {
    List<User> users = new ArrayList<>();

    return users;
  }


  @GetMapping("/users/{userId}")
  public ResponseEntity<?> getUser(@PathVariable int userId) {
    //service.getUser(id)
    User user = new User();


    return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
  }


  @GetMapping("/welcome")
  public String welcome(/*@RequestHeader(name="Accept-Language", required= false) Locale locale*/) {
    // null == method takes multiple arguments which means you can define variable in prop file
    // and then you can pass those values here it will be parsed automatically.
    //return source.getMessage("welcome.message",null, locale);

    // to avoid writing method parameter notion you can use LocalContextHolder.
    return source.getMessage("welcome.message", null, LocaleContextHolder.getLocale());


  }


}
