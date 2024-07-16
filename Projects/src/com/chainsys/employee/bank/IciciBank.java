package com.chainsys.employee.bank;

public class IciciBank extends Banks{
	
	public IciciBank (double balance) {
		super(balance);
	}
	
	@Override
	public double rateOfInterest() {
		return 8.0;
	}
	
}
