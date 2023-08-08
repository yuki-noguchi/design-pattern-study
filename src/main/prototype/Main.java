package main.prototype;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();

		manager.register("underline", new UnderlinePen('-'));
		manager.register("warning", new MessageBox('*'));
		manager.register("slash", new MessageBox('/'));

		Product product1 = manager.create("underline");
		product1.use("hello with underline");
		Product product2 = manager.create("warning");
		product2.use("hello with warning");
		Product product3 = manager.create("slash");
		product3.use("hello with slash");
	}
}
