package com.gyanoholic.oopdemo4;

public class BankServer {
	
	public String domainName;
	public String hostingProvider;
	private String userName;
	private String password;
	private String portNumber;
	protected String applicationName;
	
	public BankServer(String domainName, String hostingProvider, String applicationName) {
		this.domainName = domainName;
		this.hostingProvider = hostingProvider;
		this.applicationName = applicationName;
	}
	
	public void loginToServer(String userId, String password) {
		this.userName = userId;
		this.password = password;
		if(this.userName == "ADMIN" && this.password == "ADMIN@098") {
			System.out.println("Successfully Logged In!");
		}
	}
	
	public static void main(String[] args) {
		BankServer sbiServer = new BankServer("www.sbi.com", "sbi-data-center", "YONO");
	}
}
