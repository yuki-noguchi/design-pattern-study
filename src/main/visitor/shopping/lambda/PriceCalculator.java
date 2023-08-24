package main.visitor.shopping.lambda;

public class PriceCalculator implements ShoppingCartVisitor {

	private int totalPrice = 0;

	@Override
	public void visit(Product product) {
		totalPrice += product.getPrice();
	}

	public int getTotalPrice() {
		return totalPrice;
	}
}
