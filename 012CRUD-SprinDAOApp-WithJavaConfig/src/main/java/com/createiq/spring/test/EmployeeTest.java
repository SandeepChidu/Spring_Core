package com.createiq.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.spring.config.SpringConfig;
import com.createiq.spring.dao.EmployeeDAO;

public class EmployeeTest {

	public static void main(String[] args) {

ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
EmployeeDAO employeeDAO=(EmployeeDAO)applicationContext.getBean("empDAO");
System.out.println("average salary:"+employeeDAO.avgSal());
System.out.println(employeeDAO.nameSalMap());
}

}
