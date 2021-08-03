package com.createiq.spring.model;

public class Employee {
	private int eno = 120;
	private String name = "sandeep";
	private double salary = 20000.0;
	private String designation = "developer";
	
	public Employee(int eno, String name) {
		System.out.println("Employee(int eno, String name)");
		this.eno = eno;
		this.name = name;
			}
	public Employee(double salary, String designation) {
		System.out.println("Employee(double salary, String designation)");
		this.salary = salary;
		this.designation = designation;
	}
	public void displayInjectedValues() {
					System.out.println("Eno : " + eno);
				System.out.println("name : " + name);
				System.out.println("salary : " + salary);
				System.out.println("designation : " + designation);
				}


}
