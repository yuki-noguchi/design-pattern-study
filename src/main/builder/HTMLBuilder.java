package main.builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class HTMLBuilder implements Builder {

	private String fileName = "untitled.html";
	private StringBuilder sb = new StringBuilder();

	@Override
	public void makeTitle(String title) {
		fileName = title + ".html";

		sb.append("""
				<!DOCTYPE html>
				<html>
				<head>
				<meta charset="UTF-8">""");
		sb.append("<title>" + title + "</title>\n");
		sb.append("</head>\n");
		sb.append("<body>\n");
		sb.append("<h1>" + title + "</h1>\n");
	}

	@Override
	public void makeString(String str) {
		sb.append("<p>");
		sb.append(str);
		sb.append("</p>\n");
	}

	@Override
	public void makeItems(String[] items) {
		sb.append("<ul>\n");
		Stream.of(items).forEach(item -> {
			sb.append("<li>");
			sb.append(item);
			sb.append("</li>\n");
		});
		sb.append("</ul>\n");
	}

	@Override
	public void close() {
		sb.append("</body>\n");
		sb.append("</html>\n");

		createFile();
	}

	private void createFile() {
		try {
			Path path = Path.of("ex/builder/html_bulder.html");
			if (Files.exists(path)) {
				Files.delete(path);
			}

			Path file = Files.createFile(path);
			Files.write(file, sb.toString().getBytes());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getResult() {
		return fileName;
	}
}
