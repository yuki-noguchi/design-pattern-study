package main.adaptor.delegation;

public class Main {

	public static void main(String[] args) {
		// 既存のクラスに手を加えずに、目的のインターフェースに合わせることができる
		var printBanner = new PrintBanner("もじれつ");
		printBanner.printWeak();
		printBanner.printStrong();
	}
}
