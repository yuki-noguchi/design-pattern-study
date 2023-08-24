package main.decorator;

public class SideBorder extends Border {

	private char borderChar;

	public SideBorder(char borderChar, Display display) {
		super(display);
		this.borderChar = borderChar;
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

}
