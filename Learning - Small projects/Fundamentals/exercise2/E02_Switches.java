package exercise2;

import javax.swing.JOptionPane;

public class E02_Switches {

	public static void main(String[] args) {

		int ulaz = Integer.parseInt(JOptionPane.showInputDialog("Odaberi akciju: \n1 zbrajanje\n2 djeljenje"));

		switch (ulaz) {
		case 1:
			int b1 = 2;
			int b2 = 3;
			System.out.println(b1 + b2);
			break;

		case 2:
			float f1 = 3.78f;
			float f2 = 1.78f;
			System.out.println(f1 / f2);
			break;
		default:
			System.out.println("Nisi odabrao valjanu akciju");

		}
	}
}
