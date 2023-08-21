package main.bridge;

public class CharDisplayImpl extends DisplayImpl {

	private char beginSymbol;
	private char c;
	private char endSymbol;

	public CharDisplayImpl(char beginSymbol, char c, char endSymbol) {
		this.beginSymbol = beginSymbol;
		this.c = c;
		this.endSymbol = endSymbol;
	}

	@Override
	public void rawOpen() {
		System.out.print(beginSymbol);
	}

	@Override
	public void rawPrint() {
		System.out.print(c);
	}

	@Override
	public void rawClose() {
		System.out.print(endSymbol);
	}

}
