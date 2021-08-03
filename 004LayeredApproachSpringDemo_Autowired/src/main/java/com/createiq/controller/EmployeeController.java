package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

		public void save(Employee employee) {
		employeeService.save(employee);
		System.out.println("Controller save method called...!");
	}
}
