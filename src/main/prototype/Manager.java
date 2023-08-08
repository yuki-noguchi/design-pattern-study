package main.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	private Map<String, Product> showchase = new HashMap<>();

	public void register(String name, Product prototype) {
		showchase.put(name, prototype);
	}

	public Product create(String prototypeName) {
		Product prototype = showchase.get(prototypeName);
		return prototype.createCopy();
	}
}
