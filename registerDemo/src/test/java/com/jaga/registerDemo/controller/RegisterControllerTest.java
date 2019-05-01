package com.jaga.registerDemo.controller;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jaga.registerDemo.entity.Employee;
import com.jaga.registerDemo.factory.EmployeeMockFactory;
import com.jaga.registerDemo.service.RegisterService;


public class RegisterControllerTest {
	
	@InjectMocks
	RegisterationController registerController;
	
	@Mock
	private RegisterService regService;
		
	private EmployeeMockFactory mockFactory;
	
	@BeforeClass
	public void setup(){
		MockitoAnnotations.initMocks(this);
		mockFactory = new EmployeeMockFactory();
	}
	
	@Test
	public void registerTest() throws Exception{
		Employee emp = mockFactory.getEmpObject();
		Mockito.when(regService.register(emp)).thenReturn("success");
		Assert.assertEquals(registerController.register(emp).getBody().getResponse(), "success");
	}
	
	@Test
	public void registerTestException() throws Exception{
		Mockito.when(regService.register(null)).thenThrow(Exception.class);
		Assert.assertEquals(registerController.register(null).getBody().getResponse(), "error");
	}
}
