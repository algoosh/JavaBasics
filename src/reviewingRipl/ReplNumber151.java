package reviewingRipl;

import java.util.ArrayList;

public class ReplNumber151 {

	public static void main(String[] args) {
		ArrayList<Boolean> a = new ArrayList<Boolean>();

		a.add(true);
		a.add(false);
		a.add(false);
		for (Boolean m : a) {
			System.out.print(m + ",");

			for (Boolean m1 : a) {
				System.out.print(m1 + ",");

			}

		}

	}
}