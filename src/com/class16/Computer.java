package com.class16;

public class Computer {

	// we need define futures and attributes

	int screen, memory, ram;

	boolean keyboard, mouse;

	String os;

	public static void main(String[] args) {

		Computer comp1 = new Computer();// we just create an object "comp1" in class "Computer"

		comp1.os = "Window";

		comp1.screen = 2;

		comp1.ram = 8;

		comp1.memory = 2;

		comp1.keyboard = true;

		comp1.mouse = true;

		System.out.println("My computer had memory " + comp1.memory);

		// Define behave;

		comp1.watchMovies();

		comp1.browse();

		comp1.listenMusic();

	}

	void watchMovies() {

		System.out.println("i can watch movies");

	}

	void listenMusic() {

		System.out.println("i can listen");

	}

	void browse() {

		System.out.println("i can browse");

	}

}