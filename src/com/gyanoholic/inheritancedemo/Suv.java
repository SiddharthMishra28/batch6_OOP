package com.gyanoholic.inheritancedemo;

public class Suv extends Vehicle{
	
	Tyre tyre;
	
	public static void main(String[] args) {
		Engine kirloskar = new Engine();
		kirloskar.make = "kirloskar";
		Transmission cvt = new Transmission();
		cvt.type = "CVT";
		Tyre dunlop = new Tyre();
		dunlop.tyreType = "OFFROADER";
		Platform ladderPlatform = new Platform();
		ladderPlatform.type = "BODY ON LADDER";
		Suv fortuner = new Suv();
		fortuner.engine = kirloskar;
		fortuner.platform = ladderPlatform;
		fortuner.transmission = cvt;
		fortuner.tyre = dunlop;
		System.out.println("Vehicle Detail :");
		System.out.println(fortuner.engine.make);
		System.out.println(fortuner.transmission.type);
	}
}
