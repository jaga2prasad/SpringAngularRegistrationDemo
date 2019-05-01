package com.jaga.registerDemo.repo;

import java.util.ArrayList;
import java.util.List;

import com.jaga.registerDemo.entity.Employee;

public interface RegisterDao {
	static List<Employee> emp = new ArrayList<>();
	
	String register(Employee employee) throws Exception;
}
