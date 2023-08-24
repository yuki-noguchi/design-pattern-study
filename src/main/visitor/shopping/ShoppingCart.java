package main.visitor.shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products = new ArrayList<>();

	public void add(Product product) {
		products.add(product);
	}

	public void accept(ShoppingCartVisitor visitor) {
		products.forEach(product -> product.accept(visitor));
	}
}
