package main.templatemethod;

import java.util.stream.IntStream;

public abstract class AbstractDisplay {

	public final void display() {
		open();

		IntStream.range(0, 5).forEach(ignore -> print());

		close();
	}

	protected abstract void open();

	protected abstract void print();

	protected abstract void close();
}
