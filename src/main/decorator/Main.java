package main.decorator;

public class Main {

	public static void main(String[] args) {
		Display stringDisplay = new StringDisplay("hello world");
		stringDisplay.show();

		Display sideBorder = new SideBorder('*', stringDisplay);
		sideBorder.show();

		Display fullBorder = new FullBorder(stringDisplay);
		fullBorder.show();

		Display layerdDisplay = new SideBorder('/', //
				new FullBorder( //
						new FullBorder( //
								new FullBorder( //
										new SideBorder('!', stringDisplay) //
								))));
		layerdDisplay.show();
	}

}
