package main.visitor;

@FunctionalInterface
public interface Element {

	void accept(Visitor visitor);
}
