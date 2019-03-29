package com.Quizz;

public class Quizz2 {
	public static void main(String[] args) {

//		String[] names = { "Ana", "Sasha", "Olga" };
//		for (String monkey : names)
//
//			System.out.println(monkey + ",");
//
//		System.out.println("-------------sum-------------");
//		int[] numbers = { 5, 6, 7, 8, 9 };
//		int sum = 0;
//		for (int i = 2; i < numbers.length; i++) {
//			sum = sum + numbers[i];
//			System.out.println(sum);
//		}
//		//System.out.println(sum);
//		
//		System.out.println("---------- Largest   ----------");
		int[] nums= {13,280,4111,555,6666,666,7999,777,8888};
		
		int largest=nums[1];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>largest) {
				largest=nums[i];

				//System.out.println("the biggest number is "+ largest);	
			}
			//System.out.println("the biggest number is "+ largest);
		}
		System.out.println("the biggest number is "+ largest);
	}

}
