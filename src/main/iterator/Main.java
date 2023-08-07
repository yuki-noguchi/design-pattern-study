package main.iterator;

public class Main {

	public static void main(String[] args) {
		var bookShelf = new BookShelf(3);

		bookShelf.addBook(new Book("カラマーゾフの兄弟"));
		bookShelf.addBook(new Book("罪と罰"));
		bookShelf.addBook(new Book("地下室の手記"));

		// MainクラスはBookShelfの実装に依存していない
		// もし内部配列からListになっても、実装を変更する必要がない
		var iterator = new BookShelfIterator(bookShelf);
		while (iterator.hasNext()) {
			var book = iterator.next();
			System.out.println(book.getName());
		}
	}
}
