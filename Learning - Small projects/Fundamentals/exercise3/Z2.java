package exercise3;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z2 {

	public static void main(String[] args) {
		
		//Program od korisnika traži unos dva cijela broja
		//sa vrijednostima unesenih brojeva deklarirajte matricu
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter secound number:"));
		
		int[][] matrix = new int[a][b];
		
		for(int i = 0;i<matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
