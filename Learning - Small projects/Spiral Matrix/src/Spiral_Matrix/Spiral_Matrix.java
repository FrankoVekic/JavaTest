package Spiral_Matrix;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Spiral_Matrix {

	public static void main(String[] args) {
		// Users input decides amount of rows and columns
		int row = Integer.parseInt(JOptionPane.showInputDialog("Select the amount of rows:"));
		int column = Integer.parseInt(JOptionPane.showInputDialog("Select the amount of columns:"));

		// current value in array
		int current = 1;
		// min and max row value
		int minRow = 0;
		int maxRow = row - 1;
		// min and max column value
		int minColumn = 0;
		int maxColumn = column - 1;
		// declaring array and its size
		int[][] matrix = new int[row][column];

		// it will loop as long as current number doesn't reach its mark (rows*columns)
		while (current <= row * column) {

			// looping from bottom right to bottom left
			for (int i = maxColumn; i >= minColumn; i--) {
				matrix[maxRow][i] = current++;
			}
			// going up
			maxRow--;
			if (current > row * column)
				break;
			// looping from bottom left to top left
			for (int n = maxRow; n >= minRow; n--) {
				matrix[n][minColumn] = current++;
			}
			// going right
			minColumn++;
			if (current > row * column)
				break;
			// looping from top left to top right
			for (int i = minColumn; i <= maxColumn; i++) {
				matrix[minRow][i] = current++;
			}
			// going down
			minRow++;
			if (current > row * column)
				break;
			// looping from top right to bottom right
			for (int n = minRow; n <= maxRow; n++) {
				matrix[n][maxColumn] = current++;
			}
			// going left
			maxColumn--;
			if (current > row * column)
				break;
		}

		// printing the matrix
		for (int i = 0; i < row; i++) {
			System.out.println(Arrays.toString(matrix[i]));

		}

	}

}
