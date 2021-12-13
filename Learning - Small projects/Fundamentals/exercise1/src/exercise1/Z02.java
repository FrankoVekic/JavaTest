package exercise1;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Write room width"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Write room length"));
		
		System.out.println(num1*num2 + " m2");

	}

}
