package com.jaga.registerDemo.controller;

import java.util.ArrayList;
import java.util.List;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jaga.registerDemo.dto.EmployeeDTO;
import com.jaga.registerDemo.entity.Employee;
import com.jaga.registerDemo.factory.EmployeeMockFactory;
import com.jaga.registerDemo.service.EmployeeService;

public class EmployeeControllerTest {
	
	@InjectMocks
	private EmployeeController empController;
	
	@Mock
	EmployeeService empService;
	
	private EmployeeMockFactory mockFactory;
	
	@BeforeClass
	public void setup(){
		MockitoAnnotations.initMocks(this);
		mockFactory = new EmployeeMockFactory();
	}
	
	@Test
	public void getEmployeeTest() throws Exception{
		List<EmployeeDTO> list = mockFactory.getEmployeeDTOList();
		
		Mockito.when(empService.getEmployeeList()).thenReturn(list);
		Assert.assertEquals(empController.getEmployee().getBody().get(0).getFirstName(), "jaga");
	}
	
	@Test
	public void getEmployeeTestException() throws Exception {
		Mockito.when(empService.getEmployeeList()).thenThrow(Exception.class);
		Assert.assertEquals(empController.getEmployee().getStatusCodeValue(), 500);
	}
}
