package com.class35;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("begining of the code");
try {
	Thread.sleep(3000);
	System.out.println(10/0);
}catch(ArithmeticException e){
		System.out.println("code");
	}
catch(InterruptedException a) {
	System.out.println("code 2");

}	
	System.out.println("end");
}}
	


