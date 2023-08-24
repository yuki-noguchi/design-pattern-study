package main.visitor.zoo;

public class Lion implements Animal {

	@Override
	public void accept(Trainer trainer) {
		trainer.visit(this);
	}
}
