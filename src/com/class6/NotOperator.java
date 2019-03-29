package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		/*
		 * not operator
		 */
boolean a=!true;
System.out.println("The value of boolean variable is "+a);
boolean snow=true;
//if its not snowing ----will come to the class ELSE---NOT
if(!snow) {
	
	System.out.println("I will stay at home");

}
int x=10;
int y=20;
if(!(x>y)) {
	System.out.println("x larger then y");
	
}
		
	}

}
