package com.createiq.spring.service;

import java.util.List;

import com.createiq.spring.model.Employee;

public interface EmployeeService {

    void add(Employee employee);

	void update(Employee employee);

	void delete(Integer eid);

	Employee findById(Integer eid);

	List<Employee> findAll();
}
