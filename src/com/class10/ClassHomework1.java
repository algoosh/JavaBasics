package com.class10;

public class ClassHomework1 {

	public static void main(String[] args) {
		char[] grades=new char[5];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		/*int[] numbers = new int[3];// using only ONE line
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;*/
		
		// char[] grades= {'A','B','C','D','F','E'};
		 
		 System.out.println(grades[1]);
//--------------------------------------------------------
		 String[] names= {"Sasha","Olga","Christian","German","Mo"};
		 
		 System.out.println(names[1]);
		 //-------------------------------------
		 
		String[] words= {"Java","is","Saturday","day","coding"};
		System.out.println(words[2]+ " " + words[1]+" "+words[0]+" "+words[4]+" "+words[3]);
		 int size=words.length;
		 System.out.println("THE size of array is "+size);
		 System.out.println("THE size of array is "+words.length);
		 
		 //done and understood
	}

}
