package main.bridge;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomDisplay extends Display {

	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void randomDisplay(int times) {
		open();

		int to = new Random().nextInt(1, times);

		IntStream.range(0, to).forEach(ignore -> print());

		close();
	}
}
