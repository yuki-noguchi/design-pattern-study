package main.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry> {

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
	public int getSize() {
		return entries.stream().mapToInt(Entry::getSize).sum();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public void add(Entry entry) {
		entries.add(entry);
	}

	@Override
	public Iterator<Entry> iterator() {
		return entries.iterator();
	}
}
