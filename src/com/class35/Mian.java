package com.class35;

public class Mian {

	public static void main(String[] args) {
		int [] array= {17,99,8};
		try {
			Thread.sleep(3000);
			System.out.println(array[3]);
		}catch(InterruptedException a) {
			
		}catch(ArithmeticException a) {
			
		}catch (Exception a) {
			
		}
		System.out.println("code after an exception");

	}

}
