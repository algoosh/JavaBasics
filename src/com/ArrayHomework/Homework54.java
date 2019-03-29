package com.ArrayHomework;

public class Homework54 {

	public static void main(String[] args) {
		/*Write a program that creates an array of strings with the following 
		 * values{"This", "is", "array", "of", "strings"} 
		 * and prints all values in one line

		Hint: This is array of strings*/
String[] words= {"This", "is", "array", "of", "strings"};
System.out.println(words[0]+" "+words[1]+" "+words[2]+" "+words[3]+" "+words[4]);
char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
//size is 6
for (int i=0; i<=grades.length-1; i++)
{System.out.println(grades[i]);}
	}

}

