package com.class25;

public class Casting {

	public static void main(String[] args) {
		// Automatic/Widening--compiler takes care of conversion implicit/
double a=10;
System.out.println(a);


//Explicit/Manual/Narrowing-----user takes care of conversion
double b=10.0;
int c=(int)b;

int i=130;
//byte by=130;--compiler wont allows since its big 
byte by=(byte)i;
System.out.println(by);
//up Casting---compiler will take care of it

Payment pay=new MasterCard();
//MasterCard mc=new Payment(); wont allows to put biigger in smaller (Parent clss in Child class)
MasterCard mc=(MasterCard)new Payment();//this is a syntax




	}

}
