package com.createiq.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.spring.dao.EmployeeDAO;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("empDAO");

		// System.out.println(employeeDAO.findById(102));

		//System.out.println("Count : " + employeeDAO.avgSal());

		//System.out.println(employeeDAO.nameSalMap());
		
		System.out.println(employeeDAO.findAll());

	}

}
