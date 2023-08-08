package main.prototype;

import java.util.List;
import java.util.stream.IntStream;

public class MessageBox extends Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String str) {
		List<Character> decochars = IntStream.range(0, str.length() + 2).mapToObj(ignore -> decochar).toList();
		decochars.forEach(System.out::print);
		System.out.println();
		System.out.println(decochar + str + decochar);
		decochars.forEach(System.out::print);
		System.out.println();
	}
}
