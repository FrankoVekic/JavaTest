package exercise1;

import javax.swing.JOptionPane;

public class E03_Wrappers {

	public static void main(String[] args) {

		int age;

		System.out.println(Integer.MAX_VALUE);

		age = Integer.parseInt(JOptionPane.showInputDialog("Write age"));
		
		int result = age + 4;
		
		System.out.println(result);
	}

}
