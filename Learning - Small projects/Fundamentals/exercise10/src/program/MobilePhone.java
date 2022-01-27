package program;

import java.math.BigDecimal;

public class MobilePhone {

	private int id;
	private String name;
	private BigDecimal price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public MobilePhone(int id, String name, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public MobilePhone() {

	}

	@Override
	public String toString() {
		return name + ", " + price + " kn";
	}

}
