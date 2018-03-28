package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.LoginDao;
import com.springboot.exception.AuthenticationException;
import com.springboot.model.User;

@Service
public class LoginService {

	public boolean validateCredentials(User login) throws AuthenticationException{
		System.out.println("In login service"+ login);
		
		if(login.getUsername().equals("username") && login.getPassword().equals("password")) {
			return true;
		}else 
			throw new AuthenticationException("Invalid Credientials");
	}
	
	public void registerUser(User user) {
		
	}
}
