package reviewingRipl;

public class ForLoop42 {

	public static void main(String[] args) {
		/*
		 * Create a for loop that prints out numbers from 0 to 12 Must not include the
		 * number 12 in the output Increment by 1 example(i++) Output: 0 1 2 3 4 5 6 7 8
		 * 9 10 11
		 */
		for (int a = 0; a < 12; a++) {
			System.out.println(a);
		}
//-------------------ForLoop45-------------------------
		/*Create a for loop that prints out
		 *  odd numbers from 5 to 22
Increment by 1 example(i++)
Must not include the number 22 in the output 
Output:  
5
7
9
11
13
15
17
19
21*/
		for(int b=5;b<22;b++) {
			if(b%2!=0)
				System.out.println(b);
		}
		//--------------------------ForLoop50----------
		/*Write a program that prints the count down from 10 up to 1 and
		 *  string "Happy New Year!".


Output:
10
9
8
7
6
5
4
3
2
1
Happy New Year!
*/
		for (int c=10;c>=1;c--) {
			System.out.println(c);
		}
		System.out.println("Happy NY");
	}
}
