package com.practise1.encapsulation;

public class Employee {
	private int salary;
	private String name;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary<10000) {
			this.salary=10000;
		}
			else {
				this.salary=salary;
				
			}
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
