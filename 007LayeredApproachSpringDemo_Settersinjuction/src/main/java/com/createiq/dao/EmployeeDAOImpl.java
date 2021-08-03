package com.createiq.dao;

import com.createiq.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	public void save(Employee employee) {
		System.out.println("Employee Dao is Called");
		System.out.println(employee.toString());
	}
}
