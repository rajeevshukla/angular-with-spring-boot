package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.AuthenticationException;
import com.springboot.model.Login;
import com.springboot.model.LoginStatus;
import com.springboot.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public LoginStatus submitLogin(@ModelAttribute Login login) {
		LoginStatus loginStatus = new LoginStatus();
		System.out.println(login);

		try {
			if (loginService.validateCredentials(login))
				loginStatus.setStatus(true);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			loginStatus.setErrorMsg(e.getMessage());
		}

		return loginStatus;
	}

}
