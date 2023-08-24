package main.visitor.zoo.lambda;

@FunctionalInterface
public interface AnimalHandler {

	void accept(Trainer trainer);
}
