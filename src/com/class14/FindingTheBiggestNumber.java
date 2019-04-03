package com.class14;

public class FindingTheBiggestNumber {

	public static void main(String[] args) {
		int[] a = new int[] { 20, 30, 50, 4, 71, 100};
		int max = a[0];
		for(int i = 1; i < a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			System.out.println(a[i]);
		}
		
		System.out.println("From The Array Element Largest Number is:" + max);
	}
	}}


