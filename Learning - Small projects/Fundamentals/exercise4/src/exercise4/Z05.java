package exercise4;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		
		int[] array = {2,4,3,4,5};
		double result=0;
		
		for(int i:array) {
			result+=i;
		}
		System.out.println(result/5);

		
		int[]nums = new int[5];
		double results=0;
		for(int k=0;k<5;k++) {
			nums[k] = Integer.parseInt(JOptionPane.showInputDialog("Enter "+ (k+1) + " number"));
		}
		for(int k:nums) {
			results+=k;
		}
		System.out.println(results/5);
	}

}
