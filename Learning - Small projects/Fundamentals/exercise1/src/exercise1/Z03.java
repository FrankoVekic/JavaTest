package exercise1;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Write the width of the septic tank"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Write the length of the septic tank"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("Write the depth of the septic tank"));
		
		System.out.println(num1*num2*num3);
	}

}
