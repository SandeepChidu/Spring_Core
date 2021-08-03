package com.createiq.controller;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService;

//	public EmployeeController(Employee employee) {
//		this.employeeService = employeeService;
//	}
	

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}


	public void save(Employee employee) {
		employeeService.save(employee);
		System.out.println("Controller save method called...!");
	}
}
