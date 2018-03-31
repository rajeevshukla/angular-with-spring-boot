package com.springboot.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.model.User;

@RestController
public class SignUpController {

	public ResponseEntity<String> signup(@RequestBody User user) {
		 //service.save()
		int id= 123; //userId that got saveed you can return as a path 
	URI uri =	ServletUriComponentsBuilder.
		fromCurrentContextPath().
		path("/{id}").
		buildAndExpand(id).toUri();
	
	return ResponseEntity.created(uri).build();
		
	}
	
	
	
	
	//HATEOAS  hypermedia as the engine of application state
	@GetMapping("/retriveAllUsers")
	public List<User> retriveAllUsers(){ 
		List<User> users = new ArrayList<>();
		
		return users;
	}
	
	
	@GetMapping("/users/{userId}")
	 public Resource<User> getUser(@PathVariable int userId) { 
		
		 //service.getUser(id)
		User user = new User();
		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retriveAllUsers());
		
		resource.add(linkTo.withRel("link-to-allUsers"));
		
		return resource;
	}
	
}
