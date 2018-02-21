package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.exception.AuthenticationException;
import com.springboot.model.Login;

@Service
public class LoginService {

	
	public boolean validateCredentials(Login login) throws AuthenticationException{
		System.out.println("In login service"+ login);
		
		if(login.getUsername().equals("username") && login.getPassword().equals("password")) {
			return true;
		}else 
			throw new AuthenticationException("Invalid Credientials");
	}
}
