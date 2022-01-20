package exercise9;

import java.math.BigDecimal;
import java.util.Date;

public class Document {

	private int id;
	private Date date;
	private BigDecimal amount;
	
	
	public Document(int id, Date date, BigDecimal amount) {
		this.id = id;
		this.date = date;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}  
	
	
}
