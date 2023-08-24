package main.visitor.zoo.lambda;

public class PerformTrainer implements Trainer {

	@Override
	public void visitLion() {
		System.out.println("さけべライオン！");
	}

	@Override
	public void visitPenguin() {
		System.out.println("およげペンギン！");
	}
}
