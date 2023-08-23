package main.strategy.ex;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("D", "B", "C", "E", "A");

		list.sort((a, b) -> a.compareTo(b));
		System.out.println(list);

		list.sort((a, b) -> b.compareTo(a));
		System.out.println(list);
	}
}
