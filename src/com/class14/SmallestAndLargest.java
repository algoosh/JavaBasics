package com.class14;

public class SmallestAndLargest {

	public static void main(String[] args) {
		int currentValueOfLargest = 0;
		int previous = 0;
		int smallest = 0;
		
		int[] array = { 65, 56, 48, 55, 12, 0, 100, 1789, 35 };
		for (int i = 0; i < array.length; i++) {
			
			int next = array[i];
			if (currentValueOfLargest < next ) {
				
				// trick
				previous = currentValueOfLargest; // 65 to 100
				
				
				currentValueOfLargest = next; // 65 to 100 to 1789
			}
			if (smallest > next) {
				smallest = next;
			}
		}
		System.out.println(previous);
		System.out.println(currentValueOfLargest);
		System.out.println(smallest);
	}

}
