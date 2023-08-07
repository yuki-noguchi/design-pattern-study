package main.iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {

	private Book[] books;
	private int last = 0;

	public BookShelf(int size) {
		this.books = new Book[size];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	public void addBook(Book book) {
		this.books[last++] = book;
	}

	public int getSize() {
		return books.length;
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
