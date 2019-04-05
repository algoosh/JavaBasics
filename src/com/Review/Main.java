package com.Review;

public class Main {

	private String carName;
	private String color;
	private int carModel;

	public static void main(String[] args) {

		String carColor;
		String carName;
		int carModelYear;

		Main car1 = new Main();
		car1.carName = "BMW";
		car1.color = "Black";
		car1.carModel = 2019;

		System.out.println("Car color is " + car1.color + " and car model year is " + car1.carModel
				+ " and car name is " + car1.carName);

		Main car2 = new Main();
		car2.carModel = 2018;
		car2.carName = "Toyota";
		car2.color = "White";

		System.out.println("Car color is " + car2.color + " and car model year is " + car2.carModel
				+ " and car name is " + car2.carName);
		//done and understood
	}

}
