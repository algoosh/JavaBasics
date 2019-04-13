package reviewingRipl;

import java.util.Scanner;

public class String66 {
	public static void main(String[] args) {
		/*
		 * For you to do: Create a String named "name" and assign the value "Timmy" to
		 * it Find out how many characters are there in the given String
		 */
		String str = "Timmy";
		System.out.println(str.length());
		System.out.println("---------------------67---isEmpty--->Boolean--------------------");
		/*
		 * For you to do: Create a String named s1 = "hello" check weather string is
		 * empty or not Create a String named s2 = "" check weather string is empty or
		 * not
		 */
		String s1 = "hello";
		String s2 = "";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println("---------------------68------toUpper--toLower------------------");
		/*
		 * Create a two Strings create first string named str1= syntaxsolutions convert
		 * into SYNTAXSOLUTIONS create first string named str2= SYNTAXSOLUTIONS convert
		 * into syntaxsolutions
		 */String str1 = "syntaxsolutions";
		String str2 = "SYNTAXSOLUTIONS";
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println("---------------------69----endsWith------>Boolean----------------");
		/*
		 * Validate if the string ends with "u" prints the Boolean value accordingly
		 * Validate if the string ends with "world" prints the Boolean value accordingly
		 * Validate if the string ends with "are" prints the Boolean value accordingly
		 * Validate if the string ends with "you" prints the Boolean value accordingly
		 */
		String a = "hello how are you";
		System.out.println(a.endsWith("u"));
		System.out.println(a.endsWith("world"));
		System.out.println(a.endsWith("are"));
		System.out.println(a.endsWith("you"));
		System.out.println("---------------------70---indexOf(letter)---output 5----------------");
		/*
		 * Print out the position of the first occurrence of "c" Print out the position
		 * of the first occurrence of " " Print out the position of the first occurrence
		 * of the variable target1 Print out the position of the first occurrence of the
		 * variable target2
		 */
		String b = "abracadabra alakazam";
		String target1 = "dab";
		String target2 = "ABRA";
		System.out.println(b.indexOf("c"));
		System.out.println(b.indexOf(" "));
		System.out.println(b.indexOf(target1));
		System.out.println(b.indexOf(target2));
		System.out.println("--PRACTICE MORE--------71 substring(5)---------------------------");
		/*
		 * Output 1: print str starting at index 5 and going to the end Output 2: print
		 * str starting at index 7 and ending at index 10 Output 3: print "harambe" this
		 * must not be a new string must be from str Output 4: print "t f" this must not
		 * be a new string must be from str on one line
		 */
		String lap = "laptops out for harambe";
		System.out.println(lap.substring(5));
		System.out.println(lap.substring(7, 10));
		System.out.println(lap.substring(16));
		System.out.println(lap.substring(3, 4) + " " + (lap.subSequence(12, 13)));
		System.out.println(lap.substring(10, 13));
		System.out.println("---------------------73----charAt(number)-----output m------------------");
		/*
		 * Print out the character in the 5th INDEX of the String str Print out the
		 * character in the 8th index of the String str Print out the character in the
		 * 1st index of the String str Print out the character in the 10th index of the
		 * String str
		 */
		String boo = "boopity bop";
		System.out.println(boo.charAt(5) + " " + (boo.charAt(8) + " " + boo.charAt(1) + " " + (boo.charAt(10))));
		System.out.println("----------------------74---pLg.equals()----------------------------");
		/*
		 * If language is Java--> print Java is a programming language. If language is
		 * C--->print C is a procedural programming language If language is C++
		 * print---> C++ is a middle-level programming language If any other print
		 * --->Doesn't match any programming language
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the programming language");
		String pLg = scan.next();
		if (pLg.equals("Java")) {
			System.out.println("Java is a programming language");
		} else if (pLg.equals("C")) {
			System.out.println("C is a procedural programming language");
		} else if (pLg.equals("C++")) {
			System.out.println("C++ is a middle-level programming language");

		} else {
			System.out.println("Doesn't match any programming language");

		}
		System.out.println("-----------------74--------------------------");
		
/*If browser is ChRoME--->Proceed with chrome Browser
If browser is FireFOX--->Proceed with firefox Browser
If browser is Ie---->Proceed with ie Browser
If any other browser ----->Invalid Browser*/
		System.out.println("Enter the name of a Browser");
String br=scan.next();
if (br.equalsIgnoreCase("ChRoME")) {
	System.out.println("Proceed with chrome Browser");
} else if (br.equalsIgnoreCase("FireFOX")) {
	System.out.println("Proceed with firefox Browser");
} else if (br.equalsIgnoreCase("Ie")) {
	System.out.println("Proceed with ie Browser");

} else {
	System.out.println("Invalid Browser");
	}
}}
