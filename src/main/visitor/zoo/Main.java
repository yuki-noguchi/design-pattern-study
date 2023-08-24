package main.visitor.zoo;

public class Main {

	public static void main(String[] args) {
		Lion lion = new Lion();
		Penguin penguin = new Penguin();

		Zoo zoo = new Zoo();
		zoo.add(penguin);
		zoo.add(lion);

		HealthCheckTrainer healthCheckTrainer = new HealthCheckTrainer();
		PerformTrainer performTrainer = new PerformTrainer();

		zoo.accept(performTrainer);
		zoo.accept(healthCheckTrainer);
	}
}
