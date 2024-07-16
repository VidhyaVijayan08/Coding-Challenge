package com.chainsys.bank;

public class Company {
	
	private String companyName;
	private Employee[] employees;
	private int numEmployees;
	
	public Company(String companyName, Employee[] employees, int numEmployees) {
		super();
		this.companyName = companyName;
		this.employees = employees;
		this.numEmployees = numEmployees;
	}
	
	public double getAverageSalary() {
		if(numEmployees == 0) {
			return 0.0;
		}
		double totalSalary = 0;
		for(Employee emp : employees) {
			totalSalary += emp.getSalary();
		}
		return totalSalary / numEmployees;
	}
	
	public double getMaxSalary() {
		if(numEmployees == 0) {
			return 0.0;
		}
		double maxSalary = employees[0].getSalary();
		for(int i = 1; i < numEmployees ; i++) {
			if(employees[i].getSalary() > maxSalary) {
				maxSalary = employees[i].getSalary();
			}
		}
		return maxSalary;
	}
	
	public Employee[] getEmployeesByDesignation(String designation) {
		int count = 0;
		for(Employee emp : employees) {
			if(emp.getDesignation().equalsIgnoreCase(designation)) {
				count++;
			}
		}
		
		Employee[] result = new Employee[count];
		int index=0;
		for(Employee emp : employees) {
			if(emp.getDesignation().equals(designation)) {
				result[index++] = emp;
			}
		}
		return result;
		
	}
}
