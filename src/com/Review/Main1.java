package com.Review;

public class Main1 {
	String breed, name, color;
	private Object dog1;

	public static void main(String[] args) {
		Main1 dog1 = new Main1();
		dog1.breed = "Husky";
		dog1.color = "blue";
		dog1.name = "J";
		System.out.println("My dog's name is " + dog1.name);
		Main1 dog2 = new Main1();
		dog2.breed = "Bulldog";
		dog2.color = "brown";
		dog2.name = "G";
		System.out.println("My dog's name is " + dog2.name);
		Main1 dog3 = new Main1();
		dog3.breed = "Labrador";
		dog3.color = "white";
		dog3.name = "V";
		System.out.println("My dog's name is " + dog3.name);

		dog1.run(); 
		dog1.play();
		dog1.bark();
		dog2.bark();
		dog2.play();
		dog2.run();
		dog3.bark();
		dog3.play();
		dog3.run();

	}

	 void bark() {
		System.out.println("Husky can bark");
System.out.println("Husky c");
	}

	 void play() {
		System.out.println("can play");

	}

	 void run() {
		System.out.println("can run");

	}
}
