package main.iterator.ex;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookShelf;
	private int index = 0;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	@Override
	public boolean hasNext() {
		return bookShelf.size() > index;
	}

	@Override
	public Book next() {
		if (!hasNext()) {
			throw new IllegalArgumentException();
		}

		return bookShelf.getBookAt(index++);
	}

}
