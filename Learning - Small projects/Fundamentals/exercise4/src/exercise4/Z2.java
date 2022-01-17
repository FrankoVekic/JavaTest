package exercise4;

import javax.swing.JOptionPane;

public class Z2 {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

		while (i >= 10) {
			i/=10;
		}
		System.out.println(i);

		
		int k = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

		while (k >= 10) {
			k=k%10;
		}
		System.out.println(k);
	}

}
