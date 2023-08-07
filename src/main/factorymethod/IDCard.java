package main.factorymethod;

public class IDCard extends Product {

	private String owner;
	private int number;

	IDCard(String owner, int number) {
		this.owner = owner;
		this.number = number;
	}

	@Override
	public void use() {
		System.out.println(this.toString() + "を使います。");
	}

	@Override
	public String toString() {
		return "[IDCard:" + number + ":" + owner + "]";
	}

}
