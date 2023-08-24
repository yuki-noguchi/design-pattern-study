package main.visitor.zoo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<AnimalHandler> handlers = new ArrayList<>();

	public void add(AnimalHandler handler) {
		handlers.add(handler);
	}

	public void accept(Trainer trainer) {
		handlers.forEach(handler -> handler.accept(trainer));
	}
}
