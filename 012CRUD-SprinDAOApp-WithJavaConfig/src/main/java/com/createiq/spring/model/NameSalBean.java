package com.createiq.spring.model;

public class NameSalBean {

	private String name;
	private Double sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "NameSalBean [name=" + name + ", sal=" + sal + "]";
	}
	
}
