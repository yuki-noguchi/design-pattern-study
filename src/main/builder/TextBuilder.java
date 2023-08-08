package main.builder;

import java.util.stream.Stream;

public class TextBuilder implements Builder {

	private StringBuilder sb = new StringBuilder();

	@Override
	public void makeTitle(String title) {
		sb.append("==========\n");
		sb.append("[");
		sb.append(title);
		sb.append("]\n");
	}

	@Override
	public void makeString(String str) {
		sb.append("■");
		sb.append(str);
		sb.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		Stream.of(items).forEach(item -> {
			sb.append("  ・");
			sb.append(item);
			sb.append("\n");
		});
	}

	@Override
	public void close() {
		sb.append("==========\n");
	}

	@Override
	public String getResult() {
		return sb.toString();
	}
}
