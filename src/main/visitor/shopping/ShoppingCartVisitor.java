package main.visitor.shopping;

public interface ShoppingCartVisitor {

	void visit(Book book);

	void visit(Fruit fruit);

	void visit(Electronic electronic);
}
