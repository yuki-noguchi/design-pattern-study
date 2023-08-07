package main.factorymethod;

public class Main {

	public static void main(String[] args) {
		// Template Methodパターンでインスタンスを生成する感じ
		Factory factory = new IDCardFactory();
		Product product1 = factory.create("じゃゔぁ太郎");
		Product product2 = factory.create("じゃゔぁ次郎");
		Product product3 = factory.create("じゃゔぁ花子");

		product1.use();
		product2.use();
		product3.use();
	}
}
