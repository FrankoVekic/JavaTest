package exercise8;

import javax.swing.JOptionPane;

public class Entry {

	public static int enterInt(String message) {
		int i = 0;
		
		while(true) {
			i = Integer.parseInt(JOptionPane.showInputDialog(message));
			if(i<1) {
				JOptionPane.showMessageDialog(null, "Number must be positive.");
				continue;
			}
			return i;
		}
	}
	
	public static double enterDouble(String message) {
		double i = 0;
		
		while(true) {
			i = Double.parseDouble(JOptionPane.showInputDialog(message));
			if(i<1) {
				JOptionPane.showMessageDialog(null, "Number must be positive.");
				continue;
			}
			return i;
		}
	}
	
	public static String enterString(String message) {
		String s="";
		
		while(true) {
			s = JOptionPane.showInputDialog(message);
			if(s.length()==0) {
				JOptionPane.showMessageDialog(null, "You have to enter this data.");
				continue;
			}
			return s;
		}
	}
}
