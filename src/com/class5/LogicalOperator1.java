package com.class5;

import java.util.Scanner;

public class LogicalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// input sale daily amount 
		//based on  sales range commission
		//commission$100 =2%
		//$200=5%
		Scanner scan;
		int sales;
		int commission;
		
		scan=new Scanner( System.in);
		System.out.println("enter sales amount");
		sales=scan.nextInt();
		if(sales>=0 && sales<=100) {
			commission=2;
		}else if (sales>=101 && sales>=200) {
			commission=5;
		}else if (sales>=201 && sales<=500) {
				commission=10;
		}else if (sales>=501) {
			commission=20;
			}else {
				commission=0;
			}
		System.out.println("Your commisison is "+commission);
		
		
		//something wrong!
		
		
		
		
		
	}

}
