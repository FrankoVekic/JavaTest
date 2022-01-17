package exercise7;

import javax.swing.JOptionPane;

public class E06_Program {

	public static void main(String[] args) {

		echoNums(oddNums(choseNum()));
		
	}

	private static int choseNum() {
		int num;
		while (true) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
			if (num > 1) {
				return num;
			}
		}
	}

	private static int[] oddNums(int num) {
		int[] array = new int[num / 2];
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0) {
				array[count++] = i;
			}
		}
		return array;
	}
	
	private static void echoNums(int[]array){
		for(int i: array) {
			if(i==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
