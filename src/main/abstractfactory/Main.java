package main.abstractfactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new ListFactory();
		Link google = factory.createLink("google", "https://google.com");
		Link amazon = factory.createLink("google", "https://amazon.com");
		Link apple = factory.createLink("google", "https://apple.com");

		Tray linkTray = factory.createTray("リンク集");
		linkTray.add(google);
		linkTray.add(amazon);
		linkTray.add(apple);

		Tray passage = factory.createTray("文字");

		Page page = factory.createPage("リンク集", "y-noguchi");
		page.add(linkTray);
		page.add(passage);

		page.output();
	}
}
