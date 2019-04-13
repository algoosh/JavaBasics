package com.class22;

public class Students {
	public Students(String name) {// Parameters are reusable can be called
		// when use multiple times
		System.out.println("Student name is " + name);
	}

	public int AvGr(int a, int b, int c)// Parameters are reusable can be called
	{
		int avarage = 0;
		avarage = avarage + (a + b + c) / 3;

		System.out.println("the avarage of a grade is " + avarage);
		return avarage;
		
		//done
	}

}
