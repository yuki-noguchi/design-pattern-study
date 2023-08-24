package main.visitor.zoo;

public class PerformTrainer implements Trainer {

	@Override
	public void visit(Lion lion) {
		System.out.println("さけべライオン！");
	}

	@Override
	public void visit(Penguin lion) {
		System.out.println("およげペンギン！");
	}

}
