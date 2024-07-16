package com.chainsys.bank;

import java.util.Scanner;

public class CompanyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter company name: ");
		String companyName = sc.nextLine().trim();
		
		System.out.println("Enter number of employees: ");
		int numEmployees = sc.nextInt();
		sc.nextLine();
		
		Employee[] employees = new Employee[numEmployees];
		
		System.out.println("Enter employee details:");
		for(int i = 0; i < numEmployees; i++){
			System.out.println("Employee " + (i + 1) + ":");
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter name: ");
			String name = sc.nextLine().trim();
			
			System.out.println("Enter designation: ");
			String designation = sc.nextLine().trim();
			
			System.out.println("Enter salary: ");
		    double salary = sc.nextDouble();
		    sc.nextLine();
		    
		    employees[i] = new Employee(id, name, designation, salary);
		}
		
		Company company = new Company(companyName, employees, numEmployees);
		
		System.out.println("Average salary: " + company.getAverageSalary());
		System.out.println("Max salary" + company.getMaxSalary());
		
		String searchDesignation = "Engineer";
		System.out.println("Employees with designation: " + searchDesignation);
		Employee[] employeesByDesignation = company.getEmployeesByDesignation(searchDesignation);
		for(Employee emp : employeesByDesignation) {
			System.out.println(emp.toString());
		}
		sc.close();
	}
}
