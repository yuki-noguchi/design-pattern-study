package main.visitor.shopping.lambda;

@FunctionalInterface
public interface ProductHandler {

	void accept(ShoppingCartVisitor visitor);
}
