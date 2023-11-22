package com.gyanohilic.oopdemo2;

public class TabletApp {
	
	String appName;
	String appVersion;
	String category;
	String screenParameters;
	
	TabletApp(String appName, String category) {
		this.appName = appName;
		this.category = category;
	}
	
	void launchApp() {
		System.out.println("##########################");
		System.out.println("Application "+this.appName+" Lauched!");
		System.out.println("##########################");
	}
	
	void setAppMetadata() {
		System.out.println("##########################");
		System.out.println("App Metadata:");
		System.out.println("App Release 2023");
		System.out.println("Device Width Adjusted to Tablet View");
		System.out.println("##########################");
	}
}
