package main.visitor.zoo.lambda;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.add(trainer -> {
			trainer.visitLion();
			trainer.visitPenguin();
		});

		HealthCheckTrainer healthCheckTrainer = new HealthCheckTrainer();
		PerformTrainer performTrainer = new PerformTrainer();

		zoo.accept(performTrainer);
		zoo.accept(healthCheckTrainer);
	}
}
