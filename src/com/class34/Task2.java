package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {
		Map<String,Integer> salaryMap=new HashMap<>();
		salaryMap.put("John", 70000);
		salaryMap.put("S", 600);
		salaryMap.put("A", 55);
		salaryMap.put("M", 2000);
		
		//int maxSalary=Integer.MIN_VALUE;
		int maxSalary=0;
		String key=null;//lets use entrySet
		
		
		for (Map.Entry<String, Integer> entry :salaryMap.entrySet()){
			
			if(entry.getValue()>maxSalary){
				maxSalary=entry.getValue();
				key=entry.getKey();
				
			}
		}
		System.out.println(maxSalary+" belongs to "+key);
		
	}

}
