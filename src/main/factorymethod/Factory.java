package main.factorymethod;

public abstract class Factory {

	public final Product create(String owner) {
		var product = createProduct(owner);

		registerProduct(product);

		return product;
	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);
}
