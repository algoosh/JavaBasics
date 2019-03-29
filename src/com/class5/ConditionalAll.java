package com.class5;

import java.util.Scanner;

public class ConditionalAll {

	public static void main(String[] args) {
// TODO Auto-generated method stub
// ask user to enter price and boolean value for sale
// Base on sale will check the price
// if price is greater than <20 apply the discount of 20%
// if price <20 but ,100 then discount 30%
// >100 but <500 then discount 50%

		boolean sale;
		int price;
		double finalPrice;
		int discount;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale = scan.nextBoolean();

		if (sale) {
			System.out.println(" Plz enter the price of the item");
			price = scan.nextInt();
			System.out.println("let's check all discounts");
			if (price < 20) {
				discount = 20;
				finalPrice = price - (price * 0.2);
				System.out.println(finalPrice);
			} else if (price >= 20 && price < 100) {
				discount = 20;
				finalPrice = price - (price * 0.3);
				System.out.println(finalPrice);
			} else if (price >= 100 && price < 500) {
				discount = 50;
				finalPrice = price - (price * 0.5);
				System.out.println(finalPrice);
			} else {
				discount = 75;
				finalPrice = price - (price * 0.5);}
System.out.println("the final price is  "+finalPrice);
		}else {System.out.println(" Not interested");
				}	}//done and understood
	//the price printed the same as discount???
//2.59 seconds
	}

