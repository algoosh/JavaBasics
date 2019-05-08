package com.class31;

import java.util.ArrayList;

public class Task2 {
	/* find out whether the given ArrayList is empty or not isEmpty();
 method of ArrayList is used to check whether the given ArrayList is empty or not.
  This method returns true
 if an ArrayList contains no elements otherwise returns false.
 
Without adding the numbers to the list call isEmpty method
after adding the one or two numbers to the list call isEmpty Method

 Output

true
false
*/
	public static void main(String[] args) {
		
		ArrayList<Integer> w=new ArrayList<>();
		System.out.println(w.isEmpty());
		w.add(5);
		System.out.println(w.isEmpty());
	}
		
		
	}
	
	
	


