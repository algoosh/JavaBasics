package com.Utube;

public class Student {
	int num;
	String name;
	float fee;

	Student(int num, String name, float fee) {
		this.num = num;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(num + " " + name + " " + fee);
	}
}

class TestThis2 {
	public static void main(String[] args) {
		Student obj1 = new Student(111, "Sasha", 5000f);
		Student obj2 = new Student(112, "Olga", 6000f);
obj1.display();
obj2.display();
	}
}
