package main.observer;

import java.util.stream.IntStream;

public class GraphObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.print(this.getClass().getSimpleName() + " ");
		IntStream.range(0, generator.getNumber()).forEach(ignore -> System.out.print("*"));
		System.out.println();
	}
}
