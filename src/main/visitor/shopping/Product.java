package main.visitor.shopping;

public abstract class Product {

	public abstract void accept(ShoppingCartVisitor visitor);
}
