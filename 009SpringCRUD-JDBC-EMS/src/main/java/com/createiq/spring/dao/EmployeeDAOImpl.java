package com.createiq.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.createiq.spring.model.Employee;
import com.createiq.spring.service.EmployeeService;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private DataSource dataSource;
	private String ename;

	public void add(Employee employee) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("INSERT INTO EMPLOYEE(eid,ename,esal) VALUES(?,?,?)");
			statement.setInt(1, employee.getEid());
			statement.setString(2, employee.getEname());
			statement.setDouble(3, employee.getEsal());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Employee employee) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("update employee set ename=?,esal=? where eid=?");
			statement.setString(1, employee.getEname());
			statement.setDouble(2, employee.getEsal());
			statement.setInt(3, employee.getEid());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void delete(Integer eid) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("delete from employee where eid=?");
			statement.setInt(1, eid);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public Employee findById(Integer eid) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("select * from employee where eid=?");
//			statement.executeQuery();
			statement.setInt(1, 104);
			ResultSet rs = statement.executeQuery();

			List<Employee> employees = new ArrayList<Employee>();
			while (rs.next()) {
				Employee employee = new Employee();

				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsal(rs.getDouble("esal"));
				employees.add(employee);
				System.out.println(employees);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	public List<Employee> findAll() {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement("select * from employee");
			ResultSet rs = statement.executeQuery();

			List<Employee> employees = new ArrayList<Employee>();
			while (rs.next()) {

				Employee employee = new Employee();

				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsal(rs.getDouble("esal"));
				employees.add(employee);

			}
			System.out.println(employees);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;

	}
}
