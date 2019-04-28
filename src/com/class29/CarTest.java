package com.class29;

public class CarTest {
	public static void main(String[] args) {
		Car car;
		
		
		 car = new Truck("blue", 25000, 300);
		double carPrice = car.carcSalesPr();
		System.out.println(carPrice);
		
		car = new Truck("blue", 25000, 300);
		double carPrice1 = car.carcSalesPr();
		System.out.println(carPrice1);
		//why the same output

	}

}
