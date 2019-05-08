package com.WednesdayClass;
/*/*A university department consists of professors and secretaries.
 *  Each professor and each secretary has a name, a salary, and a hire date. 
 *  Use inheritance and polymorphism to create an application that represents the department
 *   and its professors and secretaries as objects, and provides a test class that 
 *   creates 3 professors and 2 secretaries, 
 *   and then outputs the combined total of all of their salaries.
 */
public abstract class StaffPerson1 {//
	 String name;
	 double salary;
	 String hireDate;
	 String tellNumber;
	 String vehicleType;
	 
	 StaffPerson1(String nm, double slr,String hD,String tN,String vT){
	
	 this.name=nm;
	 this.hireDate=hD;
	 this.salary=slr;
	 this.tellNumber=tN;
	 this.vehicleType=vT;
	 }
public abstract String getName();
public abstract String gerHireDate();
public abstract double getSalary();
public abstract String getTellNumberget();
public abstract String getVehicleType();



}

	 

