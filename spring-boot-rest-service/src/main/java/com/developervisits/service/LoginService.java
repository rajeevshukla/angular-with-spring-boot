package com.developervisits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developervisits.dao.LoginDao;
import com.developervisits.exception.AuthenticationException;
import com.developervisits.model.User;

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
