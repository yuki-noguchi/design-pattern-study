package main.visitor.shopping;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.add(new Book("Harry Potter", 1000));
		cart.add(new Fruit("orange", 100, 10));
		cart.add(new Electronic("Sample", "test", 15000));

		PriceCalculator priceCalculator = new PriceCalculator();
		cart.accept(priceCalculator);
		System.out.println("total price: " + priceCalculator.getTotalPrice());
	}
}
