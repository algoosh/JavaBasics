package com.Review;

public class Main1 {
	String breed, name, color;

	public static void main(String[] args) {
		Main1 dog1 = new Main1();
		dog1.breed = "Husky";
		dog1.color = "blue";
		dog1.name = "J";
		System.out.println(dog1.breed + " can bark");

		System.out.println(dog1.breed + " can run");
		System.out.println(dog1.breed + " can play");
		Main1 dog2 = new Main1();
		dog2.breed = "Bulldog";
		dog2.color = "brown";
		dog2.name = "G";
		System.out.println(dog2.breed + " can bark");

		System.out.println(dog2.breed + " can run");
		System.out.println(dog2.breed + " can play");
		Main1 dog3 = new Main1();
		dog3.breed = "Labrador";
		dog3.color = "white";
		dog3.name = "V";
		System.out.println(dog3.breed + " can bark");

		System.out.println(dog3.breed + " can run");
		System.out.println(dog3.breed + " can play");
		dog1.run();
		dog1.play();
		dog1.bark();
}
void bark() {
		System.out.println();
}
void play() {
		System.out.println();
}
void run() {
		System.out.println();

	}
}
