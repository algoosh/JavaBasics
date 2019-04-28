package com.class29;
/*Create abstract class as  parent 
Create one abstract method and another normal instance method in the abstract class with
 implementation 
 Extends the abstract class with main class
Provide the implementation for one abstract method
 which is declared in the parent class
In main method by creating the object on main class with parent class instance and
 call those 
two methods in the main method  
{abstract method1 implementation in main class
abstract method2 implementation in parent class}
*/

	abstract class Parent{
		 abstract void m1();
		 void m2(){

		 System.out.println("abstract method2 implementation in parent class");
		}
		}

		class Main extends Parent {
		 void m1(){

		System.out.println("abstract method1 implementation in main class");
		 }


		 public static void main(String[] args) {
		   Parent pp=new Main();
		   pp.m1();
		   pp.m2();
		 }
		}

