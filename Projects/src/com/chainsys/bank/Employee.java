package com.chainsys.bank;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private double salary;
	private Object getBranch;
	
	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
}
