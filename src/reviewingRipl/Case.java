package reviewingRipl;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		System.out.println("---------74 String --alternate IF Statment using str.equals--------------------------");
		/*
		 * If language is Java--> print Java is a programming language. If language is
		 * C--->print C is a procedural programming language If language is C++
		 * print---> C++ is a middle-level programming language If any other print
		 * --->Doesn't match any programming language
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of programming language");
		String name = scan.next();
		switch (name) {
		case "Jave":
			System.out.println("Java is a programming language");
			break;

		case "C":
			System.out.println("C is a procedural programming language");
			break;

		case "C++":
			System.out.println("C++ is a middle-level programming language");
			break;
		default:

			System.out.println("Doesn't match any programming language");
			break;

		}
		System.out.println("--------74 aternate to IF STATMENT----pr.Equals()--------------");
		/*
		 * If browser is ChRoME--->Proceed with chrome Browser If browser is
		 * FireFOX--->Proceed with firefox Browser If browser is Ie---->Proceed with ie
		 * Browser If any other browser ----->Invalid Browser
		 */
		System.out.println("Enter the name of a Browser");
		String br = scan.next();
		switch (br) {
		case "ChRoME":
			System.out.println("Proceed with chrome Browser");
			break;
		case "FireFOX":
			System.out.println("Proceed with firefox Browser");
			break;
		case "Ie":
			System.out.println("Proceed with ie Browser");
			break;
		default:
			System.out.println("Invalid Browser");
		}

	}
}
