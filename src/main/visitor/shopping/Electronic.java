package main.visitor.shopping;

public class Electronic extends Product {

	private String brand;
	private String model;
	private int price;

	public Electronic(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public void accept(ShoppingCartVisitor visitor) {
		visitor.visit(this);
	}
}
