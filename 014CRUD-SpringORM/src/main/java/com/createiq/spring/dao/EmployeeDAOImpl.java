package com.createiq.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.createiq.spring.model.Employee;

@Repository("DAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(Employee employee) {
		hibernateTemplate.save(employee);
	}

	@Override
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
	}

	@Override
	public void delete(Integer eid) {
		Employee employee = new Employee();
		employee.setEid(eid);
		hibernateTemplate.delete(employee);
	}

	@Override
	public Employee findById(Integer eid) {
		System.out.println("find by id done!");
		
		return hibernateTemplate.get(Employee.class, eid);
	}

	@Override
	public List<Employee> findAll() {
		System.out.println("find all done!!");
		//return hibernateTemplate.getSessionFactory().openSession().createQuery("from EMP_TAB").list();
	
	return hibernateTemplate.loadAll(Employee.class);
	}

}
