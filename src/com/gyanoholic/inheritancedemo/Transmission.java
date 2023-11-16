package com.gyanoholic.inheritancedemo;

public class Transmission {
	
	String brand;
	String type;
	int numGears = 0;
	
	void shiftGearUp() {
		System.out.println(numGears++);
	}
	
	void shiftGearDown() {
		System.out.println(numGears--);
	}
}
