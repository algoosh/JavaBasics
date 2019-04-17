package com.class24;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		BOA boa = new BOA();
		PNC pnc = new PNC();

		
		int interestRate;
		interestRate=bank.changeInterest();
		System.out.println("Bank sharges interest="+ interestRate);
		
		interestRate=boa.changeInterest();
		System.out.println("BOA sharges interest="+ interestRate);
		bank.changeInterest();
		
		System.out.println("PNC sharges interest="+ interestRate);
		pnc.changeInterest();
		
		boa.changeInterest();
		pnc.changeInterest();  
		
		//OUTPUT 0,2,2 BUT SHOUND BE 0,2,3
	}

}
