package com.class26;

public class BankTest {

	public static void main(String[] args) {
		Bank obj = new BankA();
		obj.getBalance();
		
		BankA cap1 = new BankA();
		cap1.getBalance(1000);
		
		BankB far=new BankB();
		far.getBalance(1500);
		
		
		BankC nf=new BankC();
		nf.getBalance(2000);
		
	}

}
