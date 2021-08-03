package com.createiq.spring.dao;

import java.util.List;
import javax.sql.DataSource;

import com.createiq.spring.model.Student;

public interface StudentDAO {
   /** 
      * This is the method to be used to initialize
      * database resources ie. connection.
   */
   public void setDataSource(DataSource ds);
   
   /** 
      * This is the method to be used to list down
      * all the records from the Student table.
   */
   public List<Student> listStudents();  

   public void batchUpdate(final List<Student> students);
}