package main.bridge;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDisplayImpl extends DisplayImpl {

	private String str;

	public StringDisplayImpl(String str) {
		this.str = str;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + str + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}

	private void printLine() {
		String line = Arrays.asList(str.split("")).stream().map(s -> "-").collect(Collectors.joining());
		System.out.println("+" + line + "+");
	}
}
