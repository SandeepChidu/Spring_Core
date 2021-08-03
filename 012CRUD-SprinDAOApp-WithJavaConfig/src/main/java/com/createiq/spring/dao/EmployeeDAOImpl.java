package com.createiq.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.createiq.spring.model.Employee;
import com.createiq.spring.model.NameSalBean;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMPLOYEE VALUES(?,?,?)", employee.getEid(), employee.getEname(),
				employee.getEsal());
	}

	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMPLOYEE SET ENAME=?,ESAL=? WHERE EID=?", employee.getEname(), employee.getEsal(),
				employee.getEid());
	}

	public void delete(Integer eid) {
		jdbcTemplate.update("delete from employee where eid=? ", eid);
	}

	public Employee findById(Integer eid) {
		return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE EID = ?", new Object[] { eid },
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Integer count() {
		return (Integer) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM EMPLOYEE", Integer.class);
	}

	@Override
	public Double avgSal() {
		return jdbcTemplate.queryForObject("SELECT AVG(esal) FROM EMPLOYEE", Double.class);

	}

	public List<Map<String, Double>> nameSalListMap() {
		return jdbcTemplate.query("SELECT ENAME,ESAL FROM EMPLOYEE", (rs, num) -> {
			Map<String, Double> map = new HashMap<String, Double>();
			map.put(rs.getString(1), rs.getDouble(2));
			return map;
		});
	}

	public List<NameSalBean> nameSalWithNameSalBean() {
		return jdbcTemplate.query("SELECT ENAME,ESAL FROM EMPLOYEE", (rs, num) -> {
			NameSalBean nameSalBean = new NameSalBean();
			nameSalBean.setName(rs.getString(1));
			nameSalBean.setSal(rs.getDouble(2));
			return nameSalBean;
		});
	}

	public List<Map> nameSalMap() {
		return jdbcTemplate.query("SELECT ENAME,ESAL FROM EMPLOYEE", (rs, num) -> {
			Map map = new HashMap<>();
			map.put(rs.getMetaData().getColumnName(1), rs.getObject(1));
			map.put(rs.getMetaData().getColumnName(2), rs.getObject(2));
			return map;
		});
	}

	public List<Employee> findAll() {
//		 List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE", new
//				 RowMapper<Employee>() {
//				 @Override
//				 public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				 Employee employee = new Employee();
//				 employee.setEid(rs.getInt(1));
//				 employee.setEname(rs.getString(2));
//				 employee.setEsal(rs.getDouble(3));
//				 System.out.println("find all data sucessfully.");
//				 return employee;
//				 }
//				 });

		
		List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE", (rs, num) -> {
			Employee employee = new Employee();
			employee.setEid(rs.getInt(1));
			employee.setEname(rs.getString(2));
			employee.setEsal(rs.getDouble(3));
			System.out.println("find all data sucessfully.");
			return employee;
		});

//		List<Employee> employees = jdbcTemplate.query("SELECT * FROM EMPLOYEE",
//				new BeanPropertyRowMapper<Employee>(Employee.class));

		return employees;
	}

}
