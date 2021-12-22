package exercise3;

import java.util.Arrays;

public class E02_TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] table = new int[3][3];

		table[0][0] = 1;
		table[1][1] = 1;
		table[2][2] = 1;

		System.out.println(Arrays.toString(table[0]));
		System.out.println(Arrays.toString(table[1]));
		System.out.println(Arrays.toString(table[2]));

	}

}
