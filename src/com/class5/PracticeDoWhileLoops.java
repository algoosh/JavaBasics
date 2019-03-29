package com.class5;

public class PracticeDoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		boolean isTrue = true;

		do {
			x = x + 1;
			System.out.println(x);

			// 1
			// 2
			// 3
			// 4
			// ...

			if (x > 10) {
				isTrue = false;
			}

		} while (isTrue);

		x = 0;

		while (isTrue) {
			x = x + 1;
			System.out.println(x);

			// 1
			// 2
			// 3
			// 4
			// ...

			if (x > 10) {
				isTrue = false;
			}
		}
		
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+1);
		}
	}
}
