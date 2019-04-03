package com.class16;

public class Car {// class must have attributes and futures.
	// Lets define this
	String make, model, color;
	int doors, wheels;

	public static void main(String[] args) {
		// Class name is variableName=new ClassName();
		// 1st
		
		Car car1 = new Car();
		car1.make = "Honda";// it gives you an option
		car1.model = "civic";// it gives you an option
		car1.doors = 2;// it gives you an option
		car1.wheels = 4;// it gives you an option
		System.out.println("Car "+ car1.make+" has " +car1.wheels+" wheels");
		// 2nd object
		Car car2 = new Car();
		car2.color = "Blue";
		car2.make = "Tesla";
		car2.wheels = 4;
		car2.model = "x";
		
		
		System.out.println("Mu car is "+ car2.color + car2.make);
		//drfine behaivouie;
		car2.drive();
		car2.stop();
		car2.reverse();
	}

	void drive() {
		System.out.println("Car can drive");
	}
	void reverse() {
		System.out.println("Car can reverse");
	}
	void stop() {
		System.out.println("Car can stop");
	}
}




