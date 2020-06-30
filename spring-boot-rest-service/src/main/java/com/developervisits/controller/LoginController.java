package com.developervisits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developervisits.exception.AuthenticationException;
import com.developervisits.model.LoginStatus;
import com.developervisits.model.User;
import com.developervisits.service.LoginService;

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

		try {
			if (loginService.validateCredentials(login))
				loginStatus.setStatus(true);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			loginStatus.setErrorMsg(e.getMessage());
		}
		 ResponseEntity<LoginStatus> responseEntity = new ResponseEntity<>(loginStatus, HttpStatus.OK);
		return responseEntity;
	}
}
