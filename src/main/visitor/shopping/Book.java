package main.visitor.shopping;

public class Book extends Product {

	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public void accept(ShoppingCartVisitor visitor) {
		visitor.visit(this);
	}
}
