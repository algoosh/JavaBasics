package com.class17_2;

import java.util.Scanner;

public class ItemPriveAmount {

	public static void main(String[] args) {
		double price;
		String itemName;
		double payment;
		double balance;
		double totalPayment=0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your item name");
		itemName = scan.nextLine();

		System.out.println("Please enter your item price");
		price = scan.nextDouble();
do {
	System.out.println("Please enter the payment");
	payment = scan.nextDouble();
	
	totalPayment=totalPayment+payment;

     balance=price-totalPayment;
     System.out.println("Please enter more $ "+balance);
}while(balance!=price);

System.out.println("Thank you for shopping");

//Some mistake 
//go over and do it again
		
}		
	}

