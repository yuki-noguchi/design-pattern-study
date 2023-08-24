package main.visitor.shopping.lambda;

public class Product {

	private String name;
	private int Price;

	public Product(String name, int price) {
		this.name = name;
		Price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return Price;
	}
}
