package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClassTask1 {
	//How can you remove all duplicates from ArrayList?
	public static void main(String[] args) {
		
	
	
			List<String> a=new ArrayList<String>();
			        a.add("John");
			        a.add("Jane");
			        a.add("James");
			        a.add("Jasmine");
			        a.add("Jane");
			        a.add("James");
			        
			       /* Set<String> b=new LinkedHashSet<>();
			         b.addAll(a);
			         System.out.println(b);*/
			        
			       Set<String> b=new HashSet<>(a);
			             System.out.println(b);
}
}
