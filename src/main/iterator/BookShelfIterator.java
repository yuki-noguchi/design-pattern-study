package main.iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return bookShelf.getSize() > index;
	}

	@Override
	public Book next() {
		if (!hasNext()) {
			throw new IllegalArgumentException("存在しません");
		}

		return bookShelf.getBookAt(index++);
	}

}
