package com.gyanoholic.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<Integer> intList = new LinkedList<>();
		intList.add(1);
		intList.add(34);
		intList.add(5);
		System.out.println(intList);
		System.out.println(intList.get(2));
	}
}
