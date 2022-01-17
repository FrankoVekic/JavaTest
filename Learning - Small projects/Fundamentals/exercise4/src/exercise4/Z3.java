package exercise4;

import javax.swing.JOptionPane;

public class Z3 {

	public static void main(String[] args) {
		
		// Za uneseni cijeli broj program ispisuje dali je prim broj
		
		//prim broj je onaj koji je cijelobrojno djeljiv s brojem 1 i sam sa sobom
		//s svim ostalim brojevima između 1 i unesenog broja nije cjelobrojno djeljiv
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
		boolean prim = true;
		
		for(int j=2;j<i;j++) {
		//	System.out.println(i + "%" + j + "=" + i%j);
			if(i%j==0) {
				//System.out.println("Not a prim number");
				prim=false;
				break;
			}
		}
		System.out.println(i + " " + (prim ? "is ": "is not ") + "prim number");
		
		
		//ispisati sve prim brojeve između 278 i 2455
		
		
	}

}
