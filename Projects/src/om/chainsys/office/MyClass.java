package om.chainsys.office;

public class MyClass {
	public static void main(String[] args) {
		Manager manager = new Manager("Vidhya", 25,"985462781", "14 Rajiv Gandhi nagar", 10000, "IT Department");
		manager.printManagerDetails();
		
		Employee employee = new Employee("Santhini", 30, "9234567819", "272 Driver's colony", 20000, "Software Development");
		employee.printEmployeeDetails();
	}
}
