package com.chainsys.employee.bank;

public class MyClass {
	public static void main(String[] args) {
		
		StateBankOfIndia bankA = new StateBankOfIndia(1000);
		IciciBank bankB = new IciciBank(1500);
		Banks bankC = new Banks(2000);
		
		System.out.println("Balance in Bank A(SBI) : $ " + bankA.getBalance());
		System.out.println("Balance in Bank B(Icici) : $ " + bankB.getBalance());
		System.out.println("Balance in Bank C: $ " + bankC.getBalance());
		System.out.println("Rate of interest in SBI: " +bankA.rateOfInterest() + "%");
		System.out.println("Rate of interest in Icici: " +bankB.rateOfInterest() + "%");
		System.out.println("Rate of interest in Bank C: " + bankC.rateOfInterest() + "%");
	}
}