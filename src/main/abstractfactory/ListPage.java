package main.abstractfactory;

import java.util.stream.Collectors;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHtml() {
		StringBuilder builder = new StringBuilder();
		builder.append("html省略");
		builder.append("\nauthor: ");
		builder.append(author);
		builder.append("\ntitle: ");
		builder.append(title);
		builder.append("\ncontent: ");
		builder.append(content.stream().map(item -> "\n" + item.makeHtml()).collect(Collectors.joining()));

		return builder.toString();
	}

}
