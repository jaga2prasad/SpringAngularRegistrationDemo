package com.jaga.registerDemo.repo;

import org.springframework.stereotype.Repository;

import com.jaga.registerDemo.entity.Employee;

@Repository
public class RegisterDaoImpl implements RegisterDao{
	
	@Override
	public String register(Employee employee) throws Exception{
		emp.add(employee);
		return "success";
	}

}
