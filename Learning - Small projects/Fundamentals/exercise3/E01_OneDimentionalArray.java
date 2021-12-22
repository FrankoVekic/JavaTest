package exercise3;

import java.util.Arrays;

public class E01_OneDimentionalArray {

	public static void main(String[] args) {

		// ako je potrebno pohraniti više vrijednosti istog tipa podatka tada koristimo
		// niz

		int[] temperature = new int[12]; // glavna karakteristika niza je to što u startu moramo znati veličinu

		System.out.println(temperature.length);

		System.out.println(Arrays.toString(temperature));

		// drugi način inicijalizacije
		// int array[] = new int[5];

		// vrijednosti se dodjeljuju pomoću indexa koji kreće od broja 0

		temperature[0] = -1; // siječanj
		temperature[1] = -2;
		temperature[2] = 3;
		temperature[3] = 9;
		temperature[4] = 14;
		temperature[5] = 21;
		temperature[6] = 29;
		temperature[7] = 32;
		temperature[8] = 27;
		temperature[9] = 15;
		temperature[10] = 6;
		temperature[11] = 2; // prosinac

		System.out.println(temperature[11]);
		System.out.println(Arrays.toString(temperature));

		// prva vrijednost
		System.out.println(temperature[0]);

		// zadnja vrijednost
		System.out.println(temperature[temperature.length - 1]);

		// drugi način pisanja niza
		int[] grades = { 3, 2, 3, 2, 3, 2, 1, 2, 5, 6, 4 };

		System.out.println(Arrays.toString(grades));

		// ispiši zadnju ocjenu
		System.out.println(grades[grades.length - 1]);

		// na zadnji element niza postavi ocjenu 5
		grades[grades.length - 1] = 5;
		System.out.println(grades[grades.length - 1]);

	}

}
