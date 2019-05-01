package com.jaga.registerDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaga.registerDemo.dto.EmployeeDTO;
import com.jaga.registerDemo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employeeList")
	public ResponseEntity<List<EmployeeDTO>> getEmployee(){
		try{
			List<EmployeeDTO> emp = empService.getEmployeeList();
			return new ResponseEntity<List<EmployeeDTO>>(emp, HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<List<EmployeeDTO>>(new ArrayList<EmployeeDTO>(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
