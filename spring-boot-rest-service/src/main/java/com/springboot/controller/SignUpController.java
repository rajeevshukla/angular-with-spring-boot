package com.springboot.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
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
}
