package com.createiq.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.spring.model.Employee;
import com.createiq.spring.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");

	//	 Employee employee=new Employee(106,"Shiva",72000.00);
//		 employeeService.add(employee);
//		 System.out.println("add successfully");

//		employeeService.delete(104);
//		System.out.println("record delete successfully");

		Employee employee = new Employee();
		employee.setEname("sandy");
		employee.setEsal(45000.00);
		employee.setEid(102);
		employeeService.update(employee);
	    System.out.println("Records update sucessfully");

		// employeeService.findById(104);
//		System.out.println("find employee record");

//    employeeService.findAll();
//	System.out.println("find all employee records");
	}
}
