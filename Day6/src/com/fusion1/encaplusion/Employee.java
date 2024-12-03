package com.fusion1.encaplusion;


public class Employee {

	private String name;
	private int id;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}
	//salary is not 1000 else min pay is 10000
	public void setSalary(int salary) {
	
		this.salary = salary;
	}

}
