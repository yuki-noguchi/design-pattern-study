package main.bridge;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class IncreaseDisplay extends Display {

	public IncreaseDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void increaseDisplay(int times) {
		AtomicInteger counter = new AtomicInteger();

		IntStream.range(0, times).forEach(ignore -> {
			open();
			IntStream.range(0, counter.getAndIncrement()).forEach(_ignore -> {
				print();
			});
			close();

			if (counter.get() >= times) {
				return;
			}
		});

	}
}
