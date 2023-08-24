package main.visitor.zoo.lambda;

public class HealthCheckTrainer implements Trainer {

	@Override
	public void visitLion() {
		System.out.println("ライオンは健康！");
	}

	@Override
	public void visitPenguin() {
		System.out.println("ペンギンはあつそう！");
	}
}
