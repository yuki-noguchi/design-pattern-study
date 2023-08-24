package main.visitor.shopping;

public class PriceCalculator implements ShoppingCartVisitor {

	private int totalPrice = 0;

	@Override
	public void visit(Book book) {
		totalPrice += book.getPrice();
	}

	@Override
	public void visit(Fruit fruit) {
		totalPrice += fruit.getUnitPrice() * fruit.getQuantity();
	}

	@Override
	public void visit(Electronic electronic) {
		totalPrice += electronic.getPrice();
	}

	public int getTotalPrice() {
		return totalPrice;
	}
}
