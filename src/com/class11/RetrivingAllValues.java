package com.class11;

public class RetrivingAllValues {

	public static void main(String[] args) {
		String[][] food= {
				{"burger","hot dog","meatloaf","fries"},
				{"blini","pelmeni","vareniki"},
				{"fired rice","lo main","hot and soure"}
				
		};
for (int i=0; i<food.length; i++){
	for(int a=0;a<food[i].length; a++) {
		System.out.println(food[i][a]+" ");}}
	System.out.println();
	

}}
