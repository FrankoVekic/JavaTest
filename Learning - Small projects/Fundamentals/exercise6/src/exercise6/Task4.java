package exercise6;

import javax.swing.JOptionPane;

public class Task4 {

	public static void main(String[] args) {

		int operation = Integer.parseInt(JOptionPane.showInputDialog(
				"Choose a operation: \n1 - Add \n2 - Substract \n3 - Multiply \n4 - Divide \n5 - Exponent"));
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2:"));

		switch (operation) {
		case 1:
			int sum = num1 + num2;
			System.out.println(sum);
			break;
		case 2:
			if (num1 > num2) {
				int min = num2;
				int max = num1;
				System.out.println(max - min);
				break;
			} else if (num2 > num1) {
				int min = num1;
				int max = num2;
				System.out.println(max - min);
				break;
			} else {
				System.out.println("Enter input again");
			}

		}
	}

}
