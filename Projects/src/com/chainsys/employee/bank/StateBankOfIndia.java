package com.chainsys.employee.bank;

public class StateBankOfIndia extends Banks{
	public  StateBankOfIndia(double balance) {
		super(balance);
	}
	
	@Override
	public double rateOfInterest() {
	 return 7.5;
	}
	
}

