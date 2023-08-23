package main.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

	private String name;
	private List<Entry> entries = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int size() {
		return entries.stream().mapToInt(Entry::size).sum();
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);

		entries.forEach(entry -> entry.printList(prefix + "/" + name));
	}

	public Entry add(Entry entry) {
		entries.add(entry);
		entry.setParent(this);
		return this;
	}
}
