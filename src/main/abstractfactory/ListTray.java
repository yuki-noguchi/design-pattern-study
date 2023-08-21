package main.abstractfactory;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHtml() {
		StringBuilder builder = new StringBuilder();
		builder.append("<li>\n");
		builder.append(caption);
		builder.append("\n<ul>");
		tray.stream().forEach(item -> {
			builder.append("\n" + item.makeHtml());
		});
		builder.append("\n</ul>");
		builder.append("</li>");

		return builder.toString();
	}

}
