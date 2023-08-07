package main.adaptor.ex;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		var properites = new FileProperites();
		properites.readFromFile("ex/ex_adaptor_src.txt");
		properites.setValue("width", "1024");
		properites.setValue("height", "512");
		properites.setValue("depth", "32");
		properites.writeToFile("ex/ex_adaptor_dest.txt");
	}
}
