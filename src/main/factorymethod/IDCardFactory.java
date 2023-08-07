package main.factorymethod;

public class IDCardFactory extends Factory {

	private static int number = 100;

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner, number++);
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product.toString() + "を登録しました。");
	}
}
