package com.jaga.registerDemo.repo;

import java.util.List;

import com.jaga.registerDemo.entity.Employee;

public interface EmployeDao {
	List<Employee> getEmployeeList() throws Exception;
}
