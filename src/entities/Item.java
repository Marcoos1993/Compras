package entities;

public class Item {
	
	private String name;
	private double price;
	private int quantity;
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return name + " " +price + " quantity = " + quantity;
	}

	
	
	
	

}
