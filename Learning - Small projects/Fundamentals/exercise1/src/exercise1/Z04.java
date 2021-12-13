package exercise1;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Number"));

		if (a % 2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
