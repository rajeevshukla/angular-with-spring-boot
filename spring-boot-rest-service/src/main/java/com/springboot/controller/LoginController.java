package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Login;
import com.springboot.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public Login submitLogin(@ModelAttribute Login login) {

		System.out.println(login);
		 
		if(loginService.validateCredentials(login))
		    login.setPassword("made call to service");
		 else 
		   	login.setPassword("there is some problem");
		return login;
	} 
	
}
