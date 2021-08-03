package com.createiq.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.createiq.dao.EmployeeDAO;
import com.createiq.model.Employee;

public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public void save(Employee employee) {
		employeeDAO.save(employee);
		System.out.println("Employee Service save method Called..!!");
	}

}
