package exercise9;

import java.math.BigDecimal;
import java.util.Date;

public class Account extends Document {

	private String buyer;

	public Account(int id, Date date, BigDecimal amount, String buyer) {
		super(id, date, amount);
		this.buyer = buyer;
	}
	
	
}
