package exercise7;

import javax.swing.JOptionPane;

public class E04_Data_types_without_params {

	public static void main(String[] args) {
		int i = loadNum();
		int j= loadNum();
		
		System.out.println(i+j);

	}

	public static int loadNum()
	{
		int getBack=0;
		
		while(true) {
			getBack=Integer.parseInt(JOptionPane.showInputDialog("Enter number higher then 0"));
			if(getBack>0) {
				break;
			}
		}
		
		return getBack;
	}
	
	public static boolean randomBoolean()
	{
		int i = (int)(Math.random()*10);
		
		if(i>=5) {
			return false;
		}
		
		return true;
	}
	
	public static int[] writeArray()
	{
		int[] array = new int[loadNum()];
		
		for(int i=0;i<array.length;i++) {
			array[i] = loadNum();
		}
		
		return array;
	}
}
