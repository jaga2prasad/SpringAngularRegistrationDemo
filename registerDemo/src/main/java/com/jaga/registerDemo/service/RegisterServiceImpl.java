package com.jaga.registerDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaga.registerDemo.entity.Employee;
import com.jaga.registerDemo.repo.RegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterDao registerDao;
	
	@Override
	public String  register(Employee employee) throws Exception{
		return registerDao.register(employee);		
	}

}
