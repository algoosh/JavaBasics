package reviewingRipl;

public class Loop36 {

	public static void main(String[] args) {
		/*
		 * Create a while loop that prints out numbers from 0 to 8 Must include the
		 * number 8 in the output Increment by 1 example(a++) Output: 0 1 2 3 4 5 6 7 8
		 */
		int i = 0;
		while (i <= 8)

		{
			System.out.println(i);
			i++;
		}
		// ---------------------------------Loop37---------------------------------------
		/*
		 * Create a while loop that prints out numbers from 0 to 15
		 * 
		 * Must include the number 0 in the output
		 * 
		 * decrement by 1 example(a--)
		 * 
		 * Output: 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		 */
		int a = 15;
		while (a >= 0) {
			System.out.println(a);
			a--;
		}

		// --------------------------------------Loop40-----------------------------------
		/*
		 * Print 1 to 10 Numbers except 7 ,8,9,5 using the While loop
		 * 
		 * Step 1: Initialize the i value as int i=1
		 * 
		 * Step 2: Create the while loop to check the condition
		 * 
		 * Step 3: Write the if condition for validation part
		 * 
		 * Step 4 : It should print 1 2 3 4 6 10
		 *//*
			 * int i=1; while(i<=10) { if (i!=5 && i!=7 && i!=8 && i!=9){
			 * System.out.println(i); } i++; }
			 * 
			 * }
			 * 
			 * }
			 */

		int b = 1;
		while (b <= 10) {
			if (b != 5 && b != 7 && b != 8 && b != 9) {
				System.out.println(b);
			}
			b++;

		}

	}
}
