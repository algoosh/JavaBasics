package com.class26;

/*/*1. A boy has deposited $1000, $1500 and $2000 in banks-Bank A, 
 * Bank B and Bank C respectively. 
 * We have to print the money deposited by him in a particular bank. 
 * Create a class ‘Bank’ with a method ‘getBalance’ which returns 0.
 *  Make three subclasses named ‘BankA’, ‘BankB’ and ‘BankC’//overloading
 *   with a method with the same name ‘getBalance’ 
 *   which returns the amount deposited in that particular bank.
 *    Call the method ‘getBalance’ by the object of each of the three banks.
*/
//Parent
public class Bank {
	int deposite;

	public void getBalance() {
		System.out.println("The amount has been deposited was");
	}
}

//Child A
class BankA extends Bank {
	public void getBalance(int deposite1) {
		System.out.println("The amount has been deposited to CAP1 was 1000");
	}
}

//Child B
class BankB extends Bank {
	public void getBalance(int deposite2) {
		System.out.println("The amount has been deposited to FARGO was 1500");
	}
}

//Child C
class BankC extends Bank {
	public void getBalance(int deposite3) {
		System.out.println("The amount has been deposited to NAVFED was 2000");
	}
}
