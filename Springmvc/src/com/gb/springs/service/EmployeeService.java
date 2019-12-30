package com.gb.springs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gb.springs.dao.EmployeeDao;
import com.gb.springs.dto.Employee;

@Service
public class EmployeeService {
//space
	@Autowired
	EmployeeDao dao;
	
	
	public Employee saveEmployee( Employee employee)

	{
		
		
		
		return dao.saveEmployee(employee);
		
	}
}
