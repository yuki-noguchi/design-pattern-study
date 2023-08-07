package main.adaptor.inheritance;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String str) {
		super(str);
	}

	@Override
	public void printWeak() {
		this.showWithParen();
	}

	@Override
	public void printStrong() {
		this.showWithAster();
	}

}
