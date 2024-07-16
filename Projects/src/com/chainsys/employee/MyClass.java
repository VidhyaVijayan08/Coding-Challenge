package com.chainsys.employee;

import java.util.Scanner;

public class MyClass {
	
	public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
        int count = 0;
        for (Employee emp : employees) {
            if (emp.getBranch().equals(branch) && emp.isCompanyTransport()) {
                count++;
            }
        }
        return count;
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
        Employee firstHighest = null;
        Employee secondHighest = null;

        for (Employee emp : employees) {
            if (!emp.isCompanyTransport()) {
                if (firstHighest == null || emp.getRating() > firstHighest.getRating()) {
                    secondHighest = firstHighest;
                    firstHighest = emp;
                } else if (secondHighest == null || emp.getRating() > secondHighest.getRating()) {
                    secondHighest = emp;
                }
            }
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[4];

        for (int i = 0; i < 4; i++) {
            int employeeId = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            String branch = scanner.nextLine();
            double rating = scanner.nextDouble();
            boolean companyTransport = scanner.nextBoolean();
            employees[i] = new Employee(employeeId, name, branch, rating, companyTransport);
        }

        String branchToSearch = scanner.next();
        scanner.close();

        int count = findCountOfEmployeesUsingCompTransport(employees, branchToSearch);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No such Employees");
        }

        Employee secondHighest = findEmployeeWithSecondHighestRating(employees);
        if (secondHighest != null) {
            System.out.println(secondHighest.getEmployeeId());
            System.out.println(secondHighest.getName());
        } else {
            System.out.println("All Employees using company transport");
        }
    }
	
}
