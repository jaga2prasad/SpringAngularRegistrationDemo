package com.jaga.registerDemo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaga.registerDemo.dto.EmployeeDTO;
import com.jaga.registerDemo.entity.Employee;
import com.jaga.registerDemo.repo.EmployeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeDao empDao;
	
	
	@Override
	public List<EmployeeDTO> getEmployeeList()  throws Exception {
		List<Employee> emp = empDao.getEmployeeList();
		return sortEmployeeByName(emp);
	}
	
	
	private List<EmployeeDTO> sortEmployeeByName(List<Employee> emp){
		Collections.sort(emp,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getFirstName().compareTo(e2.getFirstName());
			}
		});
		List<EmployeeDTO> dtoList = convertEntityDTO(emp);
		return dtoList;
	}
	
	private List<EmployeeDTO> convertEntityDTO(List<Employee> emp) {
		List<EmployeeDTO> dtoList = new ArrayList<>();
		for(Employee e:emp){
			EmployeeDTO dto = new EmployeeDTO();
			dto.setFirstName(e.getFirstName());
			dto.setLastName(e.getLastName());
			dto.setGender(e.getGender());
			dto.setDob(e.getDob());
			dto.setDepartment(e.getDepartment());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
