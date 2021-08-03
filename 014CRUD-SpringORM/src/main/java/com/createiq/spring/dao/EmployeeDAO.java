package com.createiq.spring.dao;

import java.util.List;

import com.createiq.spring.model.Employee;

public interface EmployeeDAO {

	void save(Employee employee);

	void update(Employee employee);

	void delete(Integer eid);

	Employee findById(Integer eid);

	List<Employee> findAll();

}
