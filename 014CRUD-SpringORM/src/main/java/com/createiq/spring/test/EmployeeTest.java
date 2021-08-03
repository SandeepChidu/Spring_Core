package com.createiq.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.spring.dao.EmployeeDAO;
import com.createiq.spring.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("DAO");

		//employeeDAO.save(new Employee(5, "anil", 75000.00));

		// employeeDAO.update(new Employee(4, "sandeep", 45000.00));
		
		//employeeDAO.delete(4);
		
		//employeeDAO.findById(1);
		
		 employeeDAO.findAll();
		 

	}

}
