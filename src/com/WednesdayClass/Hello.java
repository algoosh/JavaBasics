package com.WednesdayClass;

public class Hello {
	public static void main(String[] args) {
		Hello obj=new Hello("Today", "is","great");
		
	}
Hello (String n) {
	
	System.out.println("This constructor with one paramentr called "+n);
}
Hello (String n1,String n2){
	this("Sasha");
	System.out.println("This constructor with two paramentrs called "+n1+" "+n2);
}
Hello( String n3,String n4, String n5){
	this("Sam","Petrov");
	System.out.println("This constructor with three paramentrs called "+n3+" "+n4+" "+n5);
}
//done and understood
}
