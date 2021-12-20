package exercise2;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi širinu"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi dužinu"));
		double c = a * b;

		if (c == 7000) {
			System.out.println("Na ovom terenu se može igrati nogomet ili ragbi");
		} else if (c >= 6500 && c < 7000) {
			System.out.println("Na ovom terenu se može igrati nogomet.");
		} else if (c == 800) {
			System.out.println("Na ovom terenu se može igrati rukomet.");
		} else {
			System.out.println("Ma bolje ići kući na komp.");
		}

	}

}
