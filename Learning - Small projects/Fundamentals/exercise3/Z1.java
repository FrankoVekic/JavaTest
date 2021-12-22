package exercise3;

import javax.swing.JOptionPane;

public class Z1 {

	public static void main(String[] args) {
		int[] num = new int[3];

		num[0] = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
		num[1] = Integer.parseInt(JOptionPane.showInputDialog("Enter secound number:"));
		num[2] = Integer.parseInt(JOptionPane.showInputDialog("Enter third number:"));

		if (num[0] > num[1] && num[0] > num[2]) {
			System.out.println(num[0]);
		} else if (num[1] > num[0] && num[1] > num[2]) {
			System.out.println(num[2]);
		} else if (num[2] > num[0] && num[2] > num[1]) {
			System.out.println(num[2]);
		} else {
			System.out.println("Try again");
		}
	}

}
