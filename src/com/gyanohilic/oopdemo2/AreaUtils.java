package com.gyanohilic.oopdemo2;

public class AreaUtils {
	
	int length;
	int width;
	String type;
	
	void calculateArea(int l, int w) {
		this.length = l;
		this.width = w;
		System.out.println("Area is "+(l*w));
	}
	
	void calculateArea(int side) {
		System.out.println("Area of Square is "+(side * side));
	}
	
	void calculateArea(int l, int w, String type) {
		if(type == "TRIANGLE") {
			System.out.println("Area is "+(0.5*l*w));
		}else if(type == "CIRCLE") {
			System.out.println("Area is "+(3.14*l*l));
		}
	}
	
	public static void main(String[] args) {
		AreaUtils a = new AreaUtils();
		a.calculateArea(5);
		
		// CREATE A CLASS CALLED AS VolumeUtils
		// DECLARE VARIABLES TO STORE LENGTH, WIDTH, HEIGHT (3D)
		// CREATE OVERLOADED METHOD TO CALCULATE VOLUMNES OF DIFFERENT GEOMETRIC FIGURES
		// UNDERSTAND POLYMORPHISM
	}
}
