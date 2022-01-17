package exercise8;

import javax.swing.JButton;

public class Start03 {

	private MobilePhone mobilePhone;
	
	public Start03() {
		
		mobilePhone = new MobilePhone();
		mobilePhone.setName("Galaxy 15");
		mobilePhone.setProducer("Samsung");
		
		System.out.println(mobilePhone.getName());
		
		mobilePhone = new MobilePhone("iPhone","Apple");
		
		System.out.println(mobilePhone.getName());
		
		//JButton button = new JButton();
		//button.getAccessibleContext().getAccessibleEditableText().getCharacterBounds(3).getClass();
	}

	public static void main(String[] args) {
		new Start03();
		//tt(); NIJE STATIČNA
	}
	
	private void tt() {
		//funkciju se može zvati u konstruktoru ali ne u main metodi
	}
}
