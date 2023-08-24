package main.visitor.shopping.lambda;

public class ShoppingCart {

	private final ProductHandler handler;

	private ShoppingCart(ProductHandler handler) {
		this.handler = handler;
	}

	public static ShoppingCart with(ProductHandler handler) {
		return new ShoppingCart(handler);
	}

	public void accept(ShoppingCartVisitor visitor) {
		handler.accept(visitor);
	}
}
