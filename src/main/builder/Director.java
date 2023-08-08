package main.builder;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("一般的なあいさつ");
		builder.makeItems(new String[] { "How are you", "Hello", "Hi" });
		builder.close();
	}
}
