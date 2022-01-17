package exercise6;

import javax.swing.JOptionPane;

public class Task3 {

	public static void main(String[] args) {
		
		int num,num2,min = 0,max = 0;
		
		while(true) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
			if(num == -1) {
				break;
			}
			
			min = num;
			max = num;
			
			
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
			
			if(num2 == -1) {
				break;
			}
			
			if(num2<min) {
				min = num2;
			}
			if(num2>max) {
				max = num2;
			}
			
			
		}
		System.out.println("Smallest: " + min + "  Largest: " + max);

	}

}
