package com.jaga.registerDemo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jaga.registerDemo.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeDao{
	
	@Autowired
	RegisterDao empList;
	@Override
	public List<Employee> getEmployeeList() throws Exception{
		return empList.emp;
	}

}
