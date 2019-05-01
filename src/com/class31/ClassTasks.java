package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassTasks {
	/*
	 * 1.Create an arraylist of cars and retrieve all the values using 4 different
	 * ways.
	 * 
	 * 2.Create an arrayList of words. Remove every word that ends with “e”.
	 * 
	 * 3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace
	 * it with water.
	 * 
	 * 4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any
	 * number that is divisible by 5 from that arrayList.
	 */
	/*
	 * for(int i=1; i<=20; i++) { alist.add(i); }
	 * 
	 * System.out.println(alist);
	 * 
	 * Iterator<Integer> iterator=alist.iterator(); while(iterator.hasNext()) { int
	 * number=iterator.next(); if(number%2!=0) { iterator.remove(); } }
	 * System.out.println(alist); }
	 */
	public static void main(String[] args) {
		// ------------------Assignment#4------------------------------------------
		/*
		 * ArrayList<Integer> num=new ArrayList<>(); for(int i=1;i<=50;i++) {
		 * num.add(i); } System.out.println(num); Iterator<Integer>
		 * iterator=num.iterator(); while(iterator.hasNext()) { int num=iterator.next();
		 * if(num/5==) { iterator.remove(); } } System.out.println(num);
		 */
//		------------------Assignment#1------------------------------------------
		/*Create an arraylist of cars and retrieve all the values using 4 different ways*/
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Nissan");
		cars.add("Mazda");
		cars.add("BMW");
		System.out.println(cars.size());
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));

		}
		for (Object num: cars) {
			System.out.println(num);
		}
		
		Iterator<String>itr=cars.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		/*System.out.println("----------using while loop----------");
		int c=0;
		
		while(numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
		}*/
		int c=0;
		while(cars.size()>c) {
			
			System.out.println(cars.get(c));
			c++;
			
			/*int count =0;
    while(num.size()>count) {
        System.out.println(num.get(count));
        count++;}*/
		}
		
	}
}
