package main.prototype;

import java.util.stream.Stream;

public class UnderlinePen extends Product {

	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String str) {
		System.out.println(str);
		Stream.of(str.split("")).forEach(ignore -> System.out.print(ulchar));
		System.out.println();
	}
}
