package com.createiq.service;

import com.createiq.bean.Employee;
import com.createiq.dao.EmployeeDAO;
import com.createiq.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
//spring rest
	// private EmployeeDAO employeeDAO=new EmployeeDAOImpl();

	private EmployeeDAOImpl employeeDAOImpl;

	public void setEmployeeDAOImpl(EmployeeDAOImpl employeeDAOImpl) {
		this.employeeDAOImpl = employeeDAOImpl;
	}

	public void save(Employee employee) {
		System.out.println("Employee Service is called");
		employeeDAOImpl.save(employee);
	}

}
