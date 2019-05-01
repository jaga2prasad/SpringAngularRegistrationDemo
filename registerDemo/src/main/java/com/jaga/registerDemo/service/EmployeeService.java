package com.jaga.registerDemo.service;

import java.util.List;

import com.jaga.registerDemo.dto.EmployeeDTO;

public interface EmployeeService {
	List<EmployeeDTO> getEmployeeList() throws Exception;
}
