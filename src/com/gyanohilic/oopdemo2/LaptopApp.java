package com.gyanohilic.oopdemo2;

public class LaptopApp extends TabletApp{

	LaptopApp(String appName, String category) {
		super(appName, category);
		//
	}
	
	//OVERLOADED CONSTRUCTOR
//	LaptopApp(String appName, String category, String playstoreId) {
//		//
//	}
	
	void launchApp() {
		System.out.println("Laptop App Launched!");
	}
	
	@Override
	void setAppMetadata() {
		System.out.println("##########################");
		System.out.println("App Metadata:");
		System.out.println("Device Width Adjusted to Laptop View");
		System.out.println("##########################");
	}
	
	public static void main(String[] args) {
//		TabletApp tApp = new TabletApp("Tablet App", "Gaming");
//		tApp.setAppMetadata();
		LaptopApp lApp = new LaptopApp("Laptop App", "Gaming");
		lApp.setAppMetadata();
		
		// CREATE A CLASS CALLED AS MOBILE APP
		// DEFINE MOBILE SPECIFIC PROPERTIES
		// DECLARE METHODS FOR LAUNCH AND EXIT
		// DECLARE OVERLOADED METHODS FOR LAUNCHING APP WITH SOME PARAMETERS
		// DECLARE A CHILD CLASS TABLET APP
		// DECLARE TAB SPECIFIC PROPERTIES'
		// DECLARE METHOD TO LAUNCH TABLET APP WITH TABE SPECIFIC PROPERTIES
		// DECLARE A THIRD CLASS CALLED AS LAPTOP APP
		// DECLARE LAPTOP SPECIFIC PROPERTIES
		// DECLARE METHODS WHICH USES APPROPRATE OBJECT TYPE FOR METHOD INVOCATION
	}

}
