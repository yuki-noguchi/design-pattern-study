package main.prototype;

public abstract class Product implements Cloneable {

	public abstract void use(String str);

	public Product createCopy() {
		try {
			return (Product) clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException();
		}
	}
}
