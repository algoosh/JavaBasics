package com.class14;

public class FindingSmallestNumber {

	public static void main(String[] args) {
		int[] a = new int[] { 20, 30, 50, 4, 71, 100 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				System.out.println(a[i]);
			}
//done
		}
	}
}
