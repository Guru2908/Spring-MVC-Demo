package com.gb.springs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gb.springs.service.EmployeeService;
import com.gb.springs.dto.Employee;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	// the below @RequestMapping is used to map the action from jsp page

	@RequestMapping(value = "/saveemp", method = RequestMethod.POST) // i
	public ModelAndView saveEmployee(@ModelAttribute Employee employee)

	{

		System.out.println("------inside controller-----------" + employee.getAddress());
		System.out.println("------inside controller-----------" + employee.getName());

		Employee employee2 = service.saveEmployee(employee);

		return new ModelAndView("success", "rtnemp", employee2.getName());

	}

}
