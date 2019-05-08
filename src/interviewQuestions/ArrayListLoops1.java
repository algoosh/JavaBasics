package interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoops1 {

	public static void main(String[] args) {
		//Assignment:print out using 4 different ways
	
		ArrayList<Double> d=new ArrayList<Double>();
		
		d.add(33.3);
		d.add(44.3);
		d.add(66.3);
		d.add(88.3);
	System.out.println("--------------for loop-------------");	
		for (int i=0;i<d.size();i++) {
			System.out.println(d.get(i));
	}
	
	System.out.println("--------------advanced for loop-------------");
	
	for (Object x:d) {
		
		System.out.println((x));
	}
	System.out.println("--------------while loop-------------");
	int c=0;
	while(c<d.size()) {
		System.out.println(d.get(c));
		c++;
		
	}	
	System.out.println("--------------Iterator-------------");
	Iterator<Double> itr=d.iterator();
	while (itr.hasNext()){
		System.out.println(itr.next());
	}
	}}
