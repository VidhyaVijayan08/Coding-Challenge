package om.chainsys.office;

public class Employee extends Member{
	String specialization;
	
	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.specialization =specialization;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address" + address);
		System.out.println("Specialization: " + specialization);
		printSalary();
	}
}
