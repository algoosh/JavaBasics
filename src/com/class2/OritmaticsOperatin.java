package com.class2;
public class OritmaticsOperatin {

		
		// declare 2 integers variables and then we perform:
		public static void main(String[] args) {
			
		// addition, subtraction, multiplication, division 
		
        int a=30;
        int b=15;
        
        int sum=a+b;
        int subt=a-b;
        int div=a/b;
        int mult=a*b;
        
        System.out.println(sum);      //45
		System.out.println(subt);   //15
		System.out.println(mult);   //450
	    System.out.println(div);   //2

        //print: the _ of two numbers is_
	    
	    System.out.println("The addition of two numbers is iqual "+sum);
	    System.out.println("The substruction of two numbers is iqual "+subt);
	    System.out.println("The multiplication of two numbers is iqual "+mult);
	    System.out.println("The division of two numbers is iqual "+div);
	    
	    // print: find the square of the number 3.9
	    double x=3.9;
	    double sqrt=x*x;
	    
	    System.out.print("The square of the number "+x+" is " +sqrt);
	    
	    // print: find the area and perimeter of a rectangle with width=5 and height =8
	    int y=8;
	    int z=5;
	    int sq=y*z;
	    int P=y+y+z+z;
	    
	    
	    System.out.println("The area of a rectangle is "+sq);
	    System.out.println("The perimeter of a rectangle is "+P);
	    
	    
	    
	    
	}
}