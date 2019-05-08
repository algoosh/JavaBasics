package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

public static void main(String[] args) {
			/*
			 * Create an ArrayList of cars and retrieve all the values using 4 different
			 * ways
			 */

			ArrayList<String> cars = new ArrayList<>();
			cars.add("Nissan");
			cars.add("Mazda");
			cars.add("BMW");
			System.out.println("The size of ArryList is " + cars.size());

			System.out.println("--------------for loop---------------");
			for (int i = 0; i < cars.size(); i++) {
				System.out.println(cars.get(i));
			}

			System.out.println("--------------Advanced for loop---------------");

			for (Object numbers : cars) {
				System.out.println(numbers);
			}

			System.out.println("--------------Iteration---------------");
			Iterator<String> itr = cars.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("----------using while loop----------");

			int count = 0;
			while (cars.size() > count) {

				System.out.println(cars.get(count));
				count++;

			}
//DONE AND UNDESRTOOD
		}}
	
