package com.class16;

public class Phone {
	// futures
	// 3 objects
	// Behavior;

	String color;
	int size;
	double price;

	public static void main(String[] args) {

		Phone iphone = new Phone();

		iphone.listen();
		iphone.makeVideos();
		iphone.talk();

		// define behavior;

		iphone.talk();
		iphone.listen();
		iphone.write();

	}

	private void makeVideos() {
		System.out.println();
	}

	void write() {
		System.out.println();
	}

	void listen() {
		System.out.println("");
	}

	void talk() {

	}

	// Phone Android=new Phone();
	// Phone Nokia=new Phone();

}
