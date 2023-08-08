package main.builder;

public class Main {

	public static void main(String[] args) {
		buildWithTextBuilder();

		buildWithHTMLBuilder();
	}

	private static void buildWithTextBuilder() {
		TextBuilder builder = new TextBuilder();
		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.getResult());
	}

	private static void buildWithHTMLBuilder() {
		HTMLBuilder builder = new HTMLBuilder();
		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.getResult());
	}
}
