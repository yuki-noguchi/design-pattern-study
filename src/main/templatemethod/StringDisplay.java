package main.templatemethod;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDisplay extends AbstractDisplay {

	private String str;

	public StringDisplay(String str) {
		this.str = str;
	}

	@Override
	protected void open() {
		printLine();
	}

	@Override
	protected void print() {
		System.out.println("|" + str + "|");
	}

	@Override
	protected void close() {
		printLine();
	}

	private void printLine() {
		var line = Arrays.stream(str.split("")).map(str -> "-").collect(Collectors.joining());
		System.out.println("+" + line + "+");
	}
}
