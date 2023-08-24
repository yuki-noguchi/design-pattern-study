package main.visitor.shopping.lambda;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = ShoppingCart.with(visitor -> {
			visitor.visit(new Product("書籍", 1000));
			visitor.visit(new Product("りんご", 100));
			visitor.visit(new Product("えんぴつ", 10));
		});

		PriceCalculator priceCalculator = new PriceCalculator();
		cart.accept(priceCalculator);

		System.out.println("total price: " + priceCalculator.getTotalPrice());
	}
}
