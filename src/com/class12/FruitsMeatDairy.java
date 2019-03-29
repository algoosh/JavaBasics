package com.class12;

public class FruitsMeatDairy {

	public static void main(String[] args) {
		String[][] shopping = { { "Apple", "Orange", "Pear" }, { "Caroot", "Cabbidge", "Tomato", "Potato" },
				{ "Milk", "Kefir" } };

		for (int i = 0; i < shopping.length; i++) {

			for (int y = 0; y < shopping[i].length; y++) {
				System.out.print(shopping[i][y] + ",");
			}
			System.out.println();
		}
//			System.out.println("-----------for each loop--------");
//			for (String[] list : shopping) {
//				for (String item : list) {
//					System.out.println(item);
//				}
//
//			}
	}
}
