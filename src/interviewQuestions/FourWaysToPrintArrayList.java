package interviewQuestions;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FourWaysToPrintArrayList {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. ●Find out whether
		 * the given ArrayList is empty or not? ●Check whether the specific name is
		 * present in an ArrayList or not? ●Find the size of your arrayList and print
		 * all values from that
		 */

		List<String> aa = new ArrayList<String>();

		aa.add("Sasha");
		aa.add("Olga");
		aa.add("Mahri");
		aa.add("Amina");
		aa.add("German");
		aa.add("Mike");
//------------------TO PRINT ALL using 5 ways---------------------
		
		//--------- just Syso(aa);-------------------------
		//System.out.println(aa);
		//-------------------for LOOP-------------------------
				//for (int i=0; i<aa.size();i++) {
				//	System.out.println(aa.get(i));
		
		 //--------------Advanced LOOP-----------------------
		 
//					for (String string:aa) {
//						System.out.print(string+",");
//				
//-----------------------While loop---------------------------
//int i=0;
//while(aa.size()>i) {
//	System.out.println(aa.get(i));
//	i++;
//}
		 //-------------------------Iterator-----------------
//           Iterator it=aa.iterator();
//while(it.hasNext()) {
//	System.out.print(it.next()+",");
//}
//
//	}	
//	}
	
	}}
