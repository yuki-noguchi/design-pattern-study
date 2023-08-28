package main.observer;

public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.println(this.getClass().getSimpleName() + ": " + generator.getNumber());
	}
}
