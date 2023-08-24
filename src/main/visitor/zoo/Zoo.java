package main.visitor.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals = new ArrayList<>();

	public void add(Animal animal) {
		animals.add(animal);
	}

	public void accept(Trainer trainer) {
		animals.forEach(animal -> animal.accept(trainer));
	}
}
