package exercise9;

import java.math.BigDecimal;
import java.util.Date;

public class Receipt extends Document {

	private String supplier;
	private boolean paid;
	

	public Receipt(int id, Date date, BigDecimal amount, String supplier, boolean paid) {
		super(id, date, amount);
		this.supplier = supplier;
		this.paid = paid;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
	
}
