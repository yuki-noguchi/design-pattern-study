package main.visitor;

public class ListVisitor extends Visitor {

	private String currentDir = "";

	@Override
	public void visit(File file) {
		System.out.println(currentDir + "/" + file.getName());
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentDir + "/" + directory.getName());

		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();

		directory.forEach(entry -> entry.accept(this));

		currentDir = saveDir;
	}
}
