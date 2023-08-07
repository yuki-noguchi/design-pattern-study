package main.templatemethod;

public class Main {

	public static void main(String[] args) {
		// ロジックを共通化できる
		System.out.println("CharDisplay");
		var charDisplay = new CharDisplay('H');
		charDisplay.display();

		System.out.println("--------------");
		System.out.println("StringDisplay");
		var stringDisplay = new StringDisplay("Hello World");
		stringDisplay.display();
	}
}
