package main.bridge;

public class Main {

	public static void main(String[] args) {
//		DisplayImpl impl = new StringDisplayImpl("string stirng");
//		CountDisplay countDisplay = new CountDisplay(impl);
//		countDisplay.display();
//		countDisplay.multiDisplay(5);
//
//		Display display = new Display(impl);
//		display.display();

//		RandomDisplay randomDisplay = new RandomDisplay(impl);
//		randomDisplay.randomDisplay(10);

		CharDisplayImpl impl = new CharDisplayImpl('<', '*', '>');
		IncreaseDisplay display = new IncreaseDisplay(impl);
		display.increaseDisplay(5);
	}
}
