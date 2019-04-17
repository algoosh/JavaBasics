package com.class24;

//parent class
public class Bank {
	public int changeInterest() {
		return 0;

	}
}

//child class
class BOA extends Bank {
	@Override//annotation
	public int changeInterest() {
		return 2;

	}
}

class PNC extends Bank {
	@Override
	public int changeInterest() {
		return 3;
	}
}
