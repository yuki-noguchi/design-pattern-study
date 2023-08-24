package main.visitor.zoo;

public class Penguin implements Animal {

	@Override
	public void accept(Trainer trainer) {
		trainer.visit(this);
	}
}
