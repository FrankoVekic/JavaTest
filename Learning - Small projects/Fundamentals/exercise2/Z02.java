package exercise2;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter secound number:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Enter third number:"));
		
		int i = 2;
		int j= 3;
		//System.out.println(i==2 ? (j==3?"!":":") : "");
		System.out.println((a<b && a<c) ? a : (b<a && b<c) ? b : c);
		
		System.out.println(a<b && a<c ? a : "");
		
		if(a<b && a<c) {
			System.out.println(a);
		}
		else if(b<a && b<c) {
			System.out.println(b);
		}
		else if(c<a && c<b) {
			System.out.println(c);
		}
		else {
			System.out.println("E sad bi i ovce i novce");
		}

	}

}
