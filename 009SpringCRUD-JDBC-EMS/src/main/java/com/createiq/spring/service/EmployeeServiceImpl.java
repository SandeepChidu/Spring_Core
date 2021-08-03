package com.createiq.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.spring.dao.EmployeeDAO;
import com.createiq.spring.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void add(Employee employee) {
		employeeDAO.add(employee);
	}

	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	public void delete(Integer eid) {
		employeeDAO.delete(eid);
	}

	
	public Employee findById(Integer eid) {
		
		return employeeDAO.findById(eid);
	}

	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
	}

	

}
