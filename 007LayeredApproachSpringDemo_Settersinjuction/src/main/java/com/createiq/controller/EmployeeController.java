package com.createiq.controller;

import java.sql.Savepoint;

import com.createiq.bean.Employee;
import com.createiq.service.EmployeeService;
import com.createiq.service.EmployeeServiceImpl;

public class EmployeeController {
	
	

	// spring webmvc or rest controller
	// EmployeeService employeeService=new EmployeeService();

	
	
	EmployeeServiceImpl employeeServiceImpl;

	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeController(EmployeeService employeeService, EmployeeServiceImpl employeeServiceImpl) {
		super();
		this.employeeServiceImpl = employeeServiceImpl;
	}

	public void addEmp(Employee employee) {
		employeeServiceImpl.save(employee);
	}

}
