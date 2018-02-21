package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.Login;

@Service
public class LoginService {

	
	public boolean validateCredentials(Login login) {
		System.out.println("In login service"+ login);
		return true;
	}
}
