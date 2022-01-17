package exercise6;

import javax.swing.JOptionPane;

public class Task1 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first num:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter secound num:"));

		if (num1 > num2) {
			int bigger = num1;
			int smaller = num2;

			for (int i = smaller+1; i < bigger; i++) {
				System.out.println(i);
			}
		} else if (num2 > num1) {
			int bigger = num2;
			int smaller = num1;
			for (int i = smaller + 1; i < bigger; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Try again");
		}

	}

}
