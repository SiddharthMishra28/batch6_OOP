package com.gyanoholic.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<>();
		myMap.put("Sid", "Java, NodeJS, Python");
		myMap.put("ashwin", "nodejs, python, rust");
		myMap.put("Sid", "another value");
		System.out.println(myMap);
		System.out.println(myMap.get("Sid"));
	}
}
