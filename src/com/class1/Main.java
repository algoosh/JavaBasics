package com.class1;

import java.util.ArrayList;

class Main{
public static void main(String[] args) {
	
	
ArrayList<String> w=new ArrayList<>();
w.add("hi");
w.add("yo");
w.add("sup");
w.add("yolo");
w.add("boop");
w.remove(0);
w.remove(1);
w.remove(2);
for(Object a:w) {
	
	
	System.out.println(a);
	
}
}
}
