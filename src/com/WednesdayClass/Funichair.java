package com.WednesdayClass;

public class Funichair {
	public static void main(String[] args) {
		Chair b=new Chair();
		b.printColor();
	}
String color="Red";
}
class Chair extends Funichair{
	String color="black";
	
	void printColor(){
		System.out.println(color);
		System.out.println(super.color);
		
	}
}
class MainClass{
	
}