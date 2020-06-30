package com.developervisits.controller;

import com.developervisits.model.LoginStatus;
import com.developervisits.model.User;
import com.developervisits.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/v1")
public class LoginController {

  @Autowired
  private LoginService loginService;

  @CrossOrigin()
  @PostMapping("/login")
  public ResponseEntity<LoginStatus> submitLogin(@RequestBody User login) {

    System.out.println(login);

    LoginStatus loginStatus = new LoginStatus();
    System.out.println(login);
    ResponseEntity<LoginStatus> responseEntity = new ResponseEntity<>(loginStatus, HttpStatus.OK);
    return responseEntity;
  }
}
