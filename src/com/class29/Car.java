package com.class29;

public class Car {
double carPrice;
String color;

public Car(String color, double carPrice) {
	this.color=color;
	this.carPrice=carPrice;
}
public double carcSalesPr() {//do see the price call this method
	return carPrice;
	
}
}
class Truck extends Car{
	int weight;
	
	
public Truck(String color, double carPrice,int weight) {
	super(color, carPrice);//super must to be FIRST IN contractor
	this.weight=weight;
	//now provide implementation 
}	
public double carcSalesPr() {
	if(weight>200) {
		carPrice-=carPrice*0.1;
	}else {
		carPrice-=carPrice*0.2;
	}
	return carPrice;
	
}
}
class Sedan extends Car{
	int lenghth;
	Sedan(String color, double carPrice,int lenghth ){
		super(color, carPrice);
		this. lenghth=lenghth;
		
	}
	public double carcSalesPr() {
		if (lenghth>20) {
			carPrice-=carPrice*0.05;
			
		}else {
			carPrice-=carPrice*0.1;
			
		}
		return carPrice;
		
	}
}