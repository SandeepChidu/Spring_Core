package com.createiq.spring.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.spring.dao.StudentJDBCTemplate;
import com.createiq.spring.model.Student;

public class StudentTest {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

      StudentJDBCTemplate studentJDBCTemplate = 
         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

      List<Student> initialStudents = studentJDBCTemplate.listStudents();
      System.out.println("Initial Students");
      
      for(Student student2: initialStudents){
         System.out.print("ID : " + student2.getId() );
         System.out.println(", Age : " + student2.getAge()); 
      }

      Student student = new Student();
      student.setId(4);
      student.setAge(10);

      Student student1 = new Student();
      student1.setId(5);
      student1.setAge(10);

      List<Student> students = new ArrayList<Student>();
      students.add(student);
      students.add(student1);

      studentJDBCTemplate.batchUpdate(students);

      List<Student> updatedStudents = studentJDBCTemplate.listStudents();
      System.out.println("Updated Students");
      
      for(Student student3: updatedStudents){
         System.out.print("ID : " + student3.getId() );
         System.out.println(", Age : " + student3.getAge()); 
      }
   }
}