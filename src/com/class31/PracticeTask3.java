package com.class31;

import java.util.ArrayList;

public class PracticeTask3 {

	public static void main(String[] args) {

ArrayList<String> names=new ArrayList<>();
names.add("Annah");
names.add("Kate");
names.add("Mike");
names.add("John");

for (int i=0; i<names.size();i++) {
	String n=names.get(i);
	
	if(n.contains("A")||n.contains("K")||n.contains("M")) {
		names.set(i,"olga");
		}}
			System.out.println(names);
		}

	}


