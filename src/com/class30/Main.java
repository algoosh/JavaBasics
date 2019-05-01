package com.class30;
/*Firstly create class above main class as EncapsulationDemo
create two instance variables in the 
private String empName;
private int empAge;

Use the Setter method to set the values and Getter Method to get the values 

In Main method when we are calling the method set the values for setter method calling as  the empName as John
and empAge 30

Employee Name: John
Employee Age: 30*/
 class EncapsulationDemo{
	  String empName;
	  private int empAge;
	  
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	   }
	
class Main{

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpName("John");
		obj.setEmpAge(30);
		System.out.println("Employee Name: "+ obj.getEmpName());
		System.out.println("Employee Age: "+ obj.getEmpAge());		

	}

}
