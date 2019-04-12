package reviewingRipl;

public class Array51 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers that stores the following
		 * values:45,78, 12, 67, 55 and then prints all its values
		 */

		int[] num = { 45, 78, 12, 67, 55 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}
//---------------------43-----------------------------

		/*
		 * Write a program that creates an array of integers that stores the following
		 * values: 45,78, 12, 67, 55, 89, 23, 77, 88 Print only values that stored with
		 * even index including 0 Hint:45 12 55 23 88
		 * 
		 */
		int[] arr = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int a = 0; a< arr.length; a+= 2) {
			System.out.print(arr[a] + " ");
		}
//--------------------------54---------------------------------------
		/*Write a program that creates an array with the following values
		 * {s, a, y,  b, n, c, t,  d, a, e, x} 
		 * and prints the values starting at index 0 and
		 *  multiple of 2 using a for loop.
              Hint: syntax'*/
      char[] let={'s', 'a', 'y',  'b','n','c', 't','d','a','e','x'}; 
		for(int a=0;a<let.length;a+=2) {
			System.out.print(let[a]);
		}
	//-------------------55----------------------------------------
		/*Write a program that creates an array of strings with the following values
		 * {"This", "is", "array", "of", "strings"} 
		 * and prints all values in one line

Hint: This is array of strings*/
		String [] sentance={"This", "is", "array", "of", "strings"} ;
		for (int a=0; a<sentance.length;a++) {
			System.out.print(sentance[a]+" ");
		}
	}
}
