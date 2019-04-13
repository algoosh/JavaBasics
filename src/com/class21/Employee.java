package com.class21;
/*Create a Class called Employee:
Create three  variables  eID , 
salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for 
each of the objects
Print out the eID , 
salary and  CEO for each of the objects*/

public class Employee {
int eID;
int salary;
public static String CEO="Samair";
public static void main(String[] args) {
	Employee emp1=new Employee();
	Employee emp2=new Employee();
	
	emp1.salary=50000;
	emp2.salary=70000;
	
	emp1.eID=001;
	emp2.eID=002;
	
	emp1.inforOfEmp1();
	emp2.inforOfEmp1();
	
}
void inforOfEmp1() {
	System.out.println("The ID of emp1 is "+eID+" and the salary is "+salary+" CEO is "+CEO );
}
}
