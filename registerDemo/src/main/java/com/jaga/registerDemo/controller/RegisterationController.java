package com.jaga.registerDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaga.registerDemo.dto.Response;
import com.jaga.registerDemo.entity.Employee;
import com.jaga.registerDemo.service.RegisterService;

@RestController
public class RegisterationController {
	
	@Autowired
	RegisterService regService;
	
	@PostMapping("/register")
	public ResponseEntity<Response> register(@RequestBody Employee employee){
		try{
			String resp = regService.register(employee);
			return new ResponseEntity<Response>(new Response(resp), HttpStatus.ACCEPTED);
		}catch(Exception e){
			return new ResponseEntity<Response>(new Response("error"),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
