package com.jaga.registerDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jaga.registerDemo.entity.Employee;
import com.jaga.registerDemo.factory.EmployeeMockFactory;
import com.jaga.registerDemo.repo.EmployeDao;

public class EmployeeServiceImplTest {
	@InjectMocks
	EmployeeServiceImpl empService;
	
	@Mock
	EmployeDao empDao;
	
	private EmployeeMockFactory mockFactory;
	
	@BeforeClass
	public void setup(){
		MockitoAnnotations.initMocks(this);
		mockFactory = new EmployeeMockFactory();
	}
	
	@Test
	public void getEmployeeTest() throws Exception{
		List<Employee> list = mockFactory.getEmployeeList();
		Mockito.when(empDao.getEmployeeList()).thenReturn(list);
		Assert.assertEquals(empService.getEmployeeList().get(0).getFirstName(), "jaga");
		
	}
	
	
}
