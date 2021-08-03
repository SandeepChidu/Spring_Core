package com.createiq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.controller.EmployeeController;
import com.createiq.model.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController controller = (EmployeeController) applicationContext.getBean("employeeController");
		controller.save(new Employee());
	}
}
