package exercise2;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter secound number:"));

		System.out.println((a + b) % 2 == 0 ? "Osijek" : "Zagreb");

		// OR

		if ((a + b) % 2 == 0) {
			System.out.println("Osijek");
		} else {
			System.out.println("Zagreb");
		}

	}

}
