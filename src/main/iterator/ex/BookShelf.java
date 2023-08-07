package main.iterator.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

	private List<Book> books;

	public BookShelf() {
		this.books = new ArrayList<>();
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public Book getBookAt(int index) {
		return this.books.get(index);
	}

	public int size() {
		return books.size();
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
