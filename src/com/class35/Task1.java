package com.class35;
/*How would handle InputMismatchException?
 *  Input Mismatch Exception when user 
 *  enters mismatch value then programmer expected.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");

	try {
		int num=scan.nextInt();
		System.out.println("number is "+num);
	}catch(InputMismatchException a) {
		//DONE
	}}}


