package com.jaga.registerDemo.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jaga.registerDemo.entity.Employee;
import com.jaga.registerDemo.factory.EmployeeMockFactory;
import com.jaga.registerDemo.repo.RegisterDao;

public class RegisterServiceImplTest {
	@InjectMocks
	RegisterServiceImpl registerService;
	
	@Mock
	RegisterDao registerDao;
	
	private EmployeeMockFactory mockFactory;
	
	@BeforeClass
	public void setup(){
		MockitoAnnotations.initMocks(this);
		mockFactory = new EmployeeMockFactory();
	}
	
	@Test
	public void registerTest() throws Exception{
		Employee emp = mockFactory.getEmpObject();
		Mockito.when(registerDao.register(emp)).thenReturn("success");
		Assert.assertEquals(registerService.register(emp), "success");
	}
	
}
