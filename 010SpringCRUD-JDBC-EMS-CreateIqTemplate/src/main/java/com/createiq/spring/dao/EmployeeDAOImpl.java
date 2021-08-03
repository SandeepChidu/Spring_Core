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
import com.createiq.spring.template.CreateIQTemplate;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private CreateIQTemplate template;

	public void add(Employee employee) {
		template.update("insert into employee values(?,?,?)", employee.getEid(), employee.getEname(),
				employee.getEsal());
	}

	public void update(Employee employee) {
		template.update("update employee set ename=?,esal=? where eid=?", employee.getEname(),
				employee.getEsal(), employee.getEid());
	}

	public void delete(Integer eid) {
		template.update("delete from employee where eid=? ", eid);
	}

	public Employee findById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	  public void update(Employee employee) {
//	  
//	  try { connection = dataSource.getConnection(); statement =
//	  connection.prepareStatement("update employee set ename=?,esal=? where eid=?"
//	  ); statement.setString(1, "Nagendra"); statement.setDouble(2, 50000.00);
//	  statement.setInt(3, 100);
//	  
//	  statement.executeUpdate(); } catch (SQLException e) { e.printStackTrace(); }
//	  finally { try { statement.close(); connection.close(); } catch (SQLException
//	  e) { e.printStackTrace(); }
//	  
//	  }
//	  
//	  }
//	  
//	  public void delete(Integer eid) { Connection connection = null;
//	  PreparedStatement statement = null;
//	  
//	  try { connection = dataSource.getConnection(); statement =
//	  connection.prepareStatement("delete from employee where eid=?");
//	  statement.setInt(1, 104); statement.executeUpdate(); } catch (SQLException e)
//	  { e.printStackTrace(); } finally {
//	  
//	  try { statement.close(); connection.close(); } catch (SQLException e) {
//	  e.printStackTrace(); }
//	  
//	  }
//	  
//	  }
//	  
//	  public Employee findById(Integer eid) {
//	  
//	  Connection connection = null; PreparedStatement statement = null;
//	  
//	  try { connection = dataSource.getConnection(); statement =
//	  connection.prepareStatement("select * from employee where eid=?"); //
//	  statement.executeQuery(); statement.setInt(1, 104); ResultSet rs =
//	  statement.executeQuery();
//	  
//	  List<Employee> employees = new ArrayList<Employee>(); while (rs.next()) {
//	  Employee employee = new Employee();
//	  
//	  employee.setEid(rs.getInt("eid")); employee.setEname(rs.getString("ename"));
//	  employee.setEsal(rs.getDouble("esal")); employees.add(employee);
//	  System.out.println(employees);
//	  
//	  }
//	  
//	  } catch (SQLException e) { // TODO Auto-generated catch block
//	  e.printStackTrace(); } finally {
//	  
//	  try { statement.close(); connection.close(); } catch (SQLException e) { //
//	  TODO Auto-generated catch block e.printStackTrace(); } }
//	  
//	  return null; }
//	  
//	  public List<Employee> findAll() {
//	  
//	  Connection connection = null; PreparedStatement statement = null;
//	  
//	  try { connection = dataSource.getConnection(); statement =
//	  connection.prepareStatement("select * from employee"); ResultSet rs =
//	  statement.executeQuery();
//	  
//	  List<Employee> employees = new ArrayList<Employee>(); while (rs.next()) {
//	  
//	  Employee employee = new Employee();
//	  
//	  employee.setEid(rs.getInt("eid")); employee.setEname(rs.getString("ename"));
//	  employee.setEsal(rs.getDouble("esal")); employees.add(employee);
//	  
//	  } System.out.println(employees);
//	  
//	  } catch (SQLException e) { // TODO Auto-generated catch block
//	  e.printStackTrace(); } finally {
//	  
//	  try { statement.close(); connection.close(); } catch (SQLException e) { //
//	  TODO Auto-generated catch block e.printStackTrace(); } }
//	  
//	  return null;
//	  
//	  }
	 
}
