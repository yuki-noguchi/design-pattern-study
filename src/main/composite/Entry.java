package main.composite;

public abstract class Entry {

	private Entry parent;

	protected void setParent(Entry parent) {
		this.parent = parent;
	};

	public abstract String getName();

	public abstract int size();

	public String fullPath() {
		StringBuilder builder = new StringBuilder();

		Entry current = this;
		do {
			builder.insert(0, "/" + current.getName());
			current = current.parent;
		} while (current != null);

		return builder.toString();
	};

	public void printList() {
		printList("");
	}

	protected abstract void printList(String prefix);

	@Override
	public String toString() {
		return getName() + "(" + size() + ")";
	}
}
