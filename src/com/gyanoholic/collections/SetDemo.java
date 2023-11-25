package com.gyanoholic.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		mySet.add("Hello");
		mySet.add("there");
		mySet.add("batch 6");
		mySet.add("batch 6");
		mySet.add("hello");
		mySet.add("Hello");
		System.out.println(mySet);
	}
}
