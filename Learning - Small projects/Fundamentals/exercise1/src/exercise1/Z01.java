package exercise1;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		
		int num1; int num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Write number 1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Write number 2"));
		
		System.out.println(num1-num2);

	}

}
