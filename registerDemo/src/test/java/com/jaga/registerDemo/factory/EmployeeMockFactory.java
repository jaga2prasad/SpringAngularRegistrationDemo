package com.jaga.registerDemo.factory;

import java.util.ArrayList;
import java.util.List;

import com.jaga.registerDemo.dto.EmployeeDTO;
import com.jaga.registerDemo.entity.Employee;

public class EmployeeMockFactory {
	
	public List<Employee> getEmployeeList(){
		Employee emp = new Employee();
		emp.setFirstName("jaga");
		List<Employee> list = new ArrayList<>();
		list.add(emp);
		return list;
	}
	
	public Employee getEmpObject(){
		Employee emp = new Employee();
		emp.setFirstName("jaga");
		return emp;
	}
	
	public List<EmployeeDTO> getEmployeeDTOList(){
		EmployeeDTO dto = new EmployeeDTO();
		dto.setFirstName("jaga");
		List<EmployeeDTO> list = new ArrayList<>();
		list.add(dto);
		return list;
	}
}
