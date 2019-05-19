package com.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. ●Find out whether
		 * the given ArrayList is empty or not? ●Check whether the specific name is
		 * present in an ArrayList or not? ●Find the size of your arrayList and print
		 * all values from that
		 */
		List<String> cc = new ArrayList<>();

		cc.add("Tyoata");
		cc.add("Nissan");
		cc.add("Mazda");
		cc.add("Merc");
		cc.add("Audi");
		cc.add("BMW");
		cc.set(3, "Ford");
		Collections.sort(cc);
		Iterator<String> it=cc.iterator();
		while(it.hasNext()) {
			if(cc.contains("a")) {
			cc.remove(it);
		}
	}
		System.out.println(it.next());
}}
