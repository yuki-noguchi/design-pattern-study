package main.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Page {

	protected String title;
	protected String author;
	protected List<Item> content = new ArrayList<>();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}

	public void output() {
		System.out.println(makeHtml());
	}

	public abstract String makeHtml();
}
