package exercise4;

import javax.swing.JOptionPane;

public class Z1 {

	public static void main(String[] args) {

		// program unosi broj između 1 i 10 i ispisuje

		int i;
		while (true) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Write a number between 1 and 10"));

			if (i < 1 || i > 10) {
				JOptionPane.showMessageDialog(null, "Number is not between 1 and 10");
				continue;
			} else {
				System.out.println(i);
				break;
			}
		}
		
		// gornji primjer ali u for petlji
		for (;;) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Write a number between 1 and 10"));

			if (i < 1 || i > 10) {
				JOptionPane.showMessageDialog(null, "Number is not between 1 and 10");
				continue;
			} else {
				System.out.println(i);
				break;
			}
		}
		

	}

}
