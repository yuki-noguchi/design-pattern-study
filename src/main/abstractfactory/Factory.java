package main.abstractfactory;

public abstract class Factory {

	public abstract Link createLink(String caption, String url);

	public abstract Tray createTray(String caption);

	public abstract Page createPage(String title, String author);
}
