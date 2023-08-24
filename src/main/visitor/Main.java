package main.visitor;

public abstract class Main {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		Directory bin = new Directory("bin");
		Directory tmp = new Directory("tmp");
		Directory usr = new Directory("usr");

		root.add(bin);
		root.add(tmp);
		root.add(usr);

		bin.add(new File("vi", 10000));
		bin.add(new File("latex", 20000));
		root.accept(new ListVisitor());
		System.out.println();

		Directory yuki = new Directory("yuki");
		Directory hanako = new Directory("hanako");
		Directory taro = new Directory("taro");
		usr.add(yuki);
		usr.add(hanako);
		usr.add(taro);

		yuki.add(new File("diary.html", 100));
		yuki.add(new File("study.java", 200));
		hanako.add(new File("memo.txt", 200));
		File taroFile = new File("game.doc", 200);
		taro.add(taroFile);
		root.accept(new ListVisitor());

	}
}
