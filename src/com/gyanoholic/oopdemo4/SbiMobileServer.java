package com.gyanoholic.oopdemo4;

public class SbiMobileServer extends BankServer{

	public SbiMobileServer(String domainName, String hostingProvider, String applicationName) {
		super(domainName, hostingProvider, applicationName);
	}
	
	public void setApplicationName(String appName) {
		super.applicationName = appName;
	}
	
	
}
