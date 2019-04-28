package com.class29;

public interface Shape {
	void carcAr(int meas);

	void carcPer(int meas);
}

class Circle implements Shape {

	@Override
	public void carcAr(int meas) {
		System.out.println("The area of a Circle is " + 3.14 * meas * meas);
	}

	@Override
	public void carcPer(int meas) {
		System.out.println("The Perimetr of a Circle is" + 2 * 3.14 * meas);

	}
}

class Square implements Shape {

	@Override
	public void carcAr(int meas) {
		System.out.println("The area of a Square is " + meas * meas);

	}

	@Override
	public void carcPer(int meas) {
		System.out.println("The area of a Square is " + meas * 4);
	}

}
