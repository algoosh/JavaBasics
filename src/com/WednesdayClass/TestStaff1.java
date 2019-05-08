package com.WednesdayClass;

import java.util.*;

public class TestStaff1 {
	public static void main(String[] args) {
		ArrayList<StaffPerson1> department=new ArrayList();
		Professor1 p1=new Professor1("John", 96000, "BMW", "10/20/2010", "1234567890");
		Professor1 p2=new Professor1("John", 96000, "BMW", "10/20/2010", "1234567890");
		Professor1 p3=new Professor1("John", 96000, "BMW", "10/20/2010", "1234567890");

		Secretory1 s1=new Secretory1("Ana", 96000, "BMW", "10/20/2010", "1234567890");
		Secretory1 s2=new Secretory1("Ana", 96000, "BMW", "10/20/2010", "1234567890");
		Secretory1 s3=new Secretory1("Ana", 96000, "BMW", "10/20/2010", "1234567890");

		department.add(new Professor1("Mike", 96000, "BMW", "10/20/2010", "1234567890"));
		department.add(new Professor1("Alex", 96000, "BMW", "10/20/2010", "1234567890"));

		department.add(new Secretory1("Ana", 96000, "BMW", "10/20/2010", "1234567890"));
		department.add(new Secretory1("Kate", 96000, "BMW", "10/20/2010", "1234567890"));
		System.out.println("Department salary total = "
				+ (p1.getSalary() + p2.getSalary() + p3.getSalary() + s1.getSalary() + s2.getSalary()));
	
	Iterator<StaffPerson1> it=department.iterator();
	double departmentSlery=0;
	while(it.hasNext()) {
	//	dep
	
	}
}}
