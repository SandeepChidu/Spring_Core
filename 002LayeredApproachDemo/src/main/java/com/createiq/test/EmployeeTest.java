package com.createiq.test;

import com.createiq.controller.EmployeeController;
import com.createiq.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeController employeeController = new EmployeeController();
		employeeController.save(new Employee());
	}
}
