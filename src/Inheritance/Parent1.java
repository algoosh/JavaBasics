package Inheritance;

public class Parent1 {

	String day(String second) {
		String x = "";
		for (int i = second.length() - 1; i >= 0; i--) {
			x = x + second.charAt(i);
		}
return x;
}
String day(String one, String two) {
		String y = "";
		if (one.length() == two.length())

			for (int i = one.length() - 1; i >= 0; i--) {
				y = y + one.charAt(i) + two.charAt(i);
}
		else {
			System.out.println("strings are not the same length");
		}
		return y;

	}
}
