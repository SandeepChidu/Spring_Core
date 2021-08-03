package com.createiq.service;

import com.createiq.dao.EmployeeDAO;
import com.createiq.model.Employee;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO)
	{
		this.employeeDAO=employeeDAO;
	}
	public void save(Employee employee) {
		employeeDAO.save(employee);
		System.out.println("Employee Service save method Called..!!");
	}

}
