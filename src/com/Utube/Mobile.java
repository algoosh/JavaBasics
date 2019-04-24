//package com.Utube;
//
//interface Features {
//	void dialing();
//
//	void messagng();
//}
//
//interface Addons {
//	void vcalling();
//
//	void mms();
//}
//
//public class Mobile implements Features {
//	public void dialing() {
//		System.out.println("FeaturedPhone is Dialing");
//	}
//
//	public void messagng() {
//		System.out.println("FeaturedPhone is Messaging");
//	}
//
//}
//class SmartPhone implements Features, Addons{
//	public void dialing() {
//		System.out.println("SmartPhone is Dialing");
//	}
//
//	public void messaging() {
//		System.out.println("SmartPhone is Messaging");
//	}
//	public void dialing1() {
//		System.out.println("SmartPhone is VCALLING");
//	}
//
//	public void messagng1() {
//		System.out.println("SmartPhone is MMS");
//	}
//}
//class Mobile{
//	public static void main(String[] args) {
//		Mobile obj=new Mobile();
//		obj.dialing();
//		obj.messagng();
//		SmartPhone obj1=new SmartPhone();
//		obj1.dialing();
//		obj1.messaging();
//		obj1.vcalling();
//		obj1.mms();
//	}
//	//Mistakes, cant see RUN
//}