package com.class27;

/*Write program as a student class  
 *  that has instance variables name and address.
 *   Create a constructor that will initialize those variables. 
 *   Print name & address of given  student by the displayInfo method.
 *   */
public class Student {
	static String name;
	static double address;

	Student(String name, double address) {
		System.out.println(name + " " + address);

	}

	void displayInfo() {
//return name;
	}

	public static void main(String[] args) {
		Student x = new Student("Sasha", 500.5);
		Student x1 = new Student("Max", 660.6);
	
}
}
//-------------------------------------------------------------------------------------------------	
/*
 * Write program as a student class that has instance variables name and
 * address. Create a constructor that will initialize those variables. Print
 * name & address of given student by the displayInfo method.
 */