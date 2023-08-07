package main.iterator.ex;

public class Main {

	public static void main(String[] args) {
		var shelf = new BookShelf();

		shelf.addBook(new Book("リファクタリング"));
		shelf.addBook(new Book("ドメイン駆動設計"));
		shelf.addBook(new Book("Effective Java"));

		var iterator = new BookShelfIterator(shelf);

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}
}