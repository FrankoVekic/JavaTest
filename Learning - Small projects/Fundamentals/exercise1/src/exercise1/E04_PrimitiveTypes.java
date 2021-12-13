package exercise1;

import javax.swing.JOptionPane;

public class E04_PrimitiveTypes {

	public static void main(String[] args) {
		
		byte num = Byte.parseByte(
				JOptionPane.showInputDialog("Enter a number between -128 and 127")
				);
		
		byte result = (byte) (num+100);
		
		System.out.println(result);
	}

}
