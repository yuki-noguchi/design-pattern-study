package main.visitor.shopping;

public class Fruit extends Product {

	private String name;
	private int unitPrice;
	private int quantity;

	public Fruit(String name, int unitPrice, int quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public void accept(ShoppingCartVisitor visitor) {
		visitor.visit(this);
	}
}
