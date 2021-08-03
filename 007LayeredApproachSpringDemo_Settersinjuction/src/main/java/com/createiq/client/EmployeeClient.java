package com.createiq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.createiq.bean.Employee;
import com.createiq.controller.EmployeeController;

public class EmployeeClient {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController employeeController=(EmployeeController)context.getBean("employeeController");
		employeeController.addEmp(new Employee(1000,"sandeep"));
	}
}
