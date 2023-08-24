package main.visitor.zoo;

public class HealthCheckTrainer implements Trainer {

	@Override
	public void visit(Lion lion) {
		System.out.println("ライオンは健康！");
	}

	@Override
	public void visit(Penguin lion) {
		System.out.println("ペンギンはあつそう！");
	}

}
