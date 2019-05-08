package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTwoWaysRetriveData {

		public static void main(String[] args) {
			Map<String, Integer> day = new HashMap<>();
			day.put("MON", 1);
			day.put("TUE", 1);
			day.put("WED", 3);
			day.put("THU", 4);
			day.put("FRI", 5);//next is printing all elements,size,replace,checking if "MON" ID TRUE

	//System.out.println(day + "," + day.size() + "," + day.replace("WED", 10) + "," + day.containsKey("MON"));
//WAY IS TO PRINT ALL data using for loop
			Set<String> d = new HashSet<>();
			for (String x : d) {
				System.out.println(x);
//				//WAY IS TO PRINT ALL data using Iterator			
//				Iterator<String>it=d.iterator();
//				it.hasNext();
//				System.out.println(it.next());
			}	
			}}
	
