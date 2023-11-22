package com.gyanohilic.oopdemo2;

public class MobilePhone {
	
	String make;
	String model;
	String netWorkCarrier;
	
	MobilePhone(){
		
	}
	
	MobilePhone(String m) {
		this.make = m;
		System.out.println("Value "+this.make+" assigned");
	}
	
	MobilePhone(String make, String model){
		
	}
	
	public static void main(String[] args) {
		MobilePhone m = new MobilePhone("Nokia");
	}
}
