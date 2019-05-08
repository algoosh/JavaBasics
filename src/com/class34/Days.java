package com.class34;

import java.util.*;

public class Days {

	public static void main(String[] args) {
		Map<String, Integer> day = new HashMap<>();
		day.put("MON", 1);
		day.put("TUE", 1);
		day.put("WED", 3);
		day.put("THU", 4);
		day.put("FRI", 5);

		/*System.out.println(day + "," + day.size() + "," + day.replace("WED", 10) + "," + day.containsKey("MON"));

		Set<String> d = new HashSet<>();
		for (String x : d) {
			System.out.println(x);
			
			Iterator<String>it=d.iterator();
			it.hasNext();
			System.out.println(it.next());*/
		//------------------------USING keySet--------------------------------------------------------
			Set<String>nks=day.keySet();
			for(String y:nks) {
				//System.out.println(y);//prints only Keys
				System.out.println(y+"="+day.get(y));//prints all Data
			}
			
//		
//		Iterator<String> keyIt=keySet.iterator();
//		while(keyIt.hasNext()) {
//			String key=keyIt.next();
//			System.out.println(key+":"+groceryMap.get(key));
//		}*/
		}
	}

