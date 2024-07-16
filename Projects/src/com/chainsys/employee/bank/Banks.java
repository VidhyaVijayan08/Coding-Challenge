package com.chainsys.employee.bank;

public class Banks implements BankInterests{
	private double balance;
	
	public Banks(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public double rateOfInterest() {
		return 5.0;
	}
	
}
