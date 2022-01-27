package program;

import java.math.BigDecimal;
import java.util.Scanner;

public class Entry {

	public static int enterInt(Scanner entry, String message) {
		int i = 0;

		while (true) {
			System.out.print(message + " ");
			i = Integer.parseInt(entry.nextLine());
			if (i < 1) {
				System.out.println("Number must be positive.");
				continue;
			}
			return i;
		}
	}

	public static BigDecimal enterBigDecimal(Scanner entry, String message) {
		BigDecimal i = BigDecimal.ZERO;

		while (true) {
			System.out.print(message + " ");
			i = new BigDecimal(entry.nextLine());
			if (i.compareTo(BigDecimal.ONE) < 0) {
				System.out.println("Number must be positive.");
				continue;
			}
			return i;
		}
	}

	public static String enterString(Scanner entry, String message) {
		String s = "";

		while (true) {
			System.out.print(message + " ");
			s = entry.nextLine();
			if (s.length() == 0) {
				System.out.println("You have to enter this data.");
				continue;
			}
			return s;
		}
	}
}
