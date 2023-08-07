package main.adaptor.ex;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;

public class FileProperites implements FileIO {

	private Properties properties = new Properties();

	@Override
	public void readFromFile(String fileName) throws IOException {
		var reader = new FileReader(fileName, Charset.forName("UTF-8"));
		properties.load(reader);
	}

	@Override
	public void writeToFile(String fileName) throws IOException {
		var writer = new FileWriter(fileName, Charset.forName("UTF-8"));
		properties.store(writer, "Written by FileProperites");
	}

	@Override
	public void setValue(String key, String value) {
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return properties.getProperty(key);
	}
}
