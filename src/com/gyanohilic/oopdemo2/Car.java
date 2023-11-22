package com.gyanohilic.oopdemo2;

public class Car {
	
	// CONSTRUCTOR
	// name is same as classname
	// GETS AUTOMATICALLY INVOKED ON OBJECT CREATION
	
	Car() {
		System.out.println("New Car Object Created!");
		System.out.println("Starting car");
	}
	
	public static void main(String[] args) {
		Car santro = new Car();
	}

}
