package main.abstractfactory;

public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHtml() {
		return "<li><a href=\"%s\">%s</a></li>\n".formatted(url, caption);
	}

}
