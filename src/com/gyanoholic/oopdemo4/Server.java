package com.gyanoholic.oopdemo4;

public class Server {
	
	// ACCESS SPECIFIERS
	// Every member variable has to be assigned definite Access Priviledges
	// default
	// public
	// private
	// protected
	// Access specifier needs to be declared before function return type, constructor, field data type
	// DEFAULT ACCESS LEVEL ALLOWS MEMBER VARIABLES AND METHODS
	// TO BE ACCSSSIBLE INSIDE SAME PACKAGE
	
	String hostname;
	int portNumber;
	String userId;
	String password;
	
	Server(String hostName, String userId, String password) {
		this.hostname = hostName;
		this.userId = userId;
		this.password = password;
	}
	
	void assignApplicationPort(int portNumber, String application) {
		if(this.userId == "AdminUser" && this.password == "Admin09876") {
			this.portNumber = portNumber;
			System.out.println("Port "+this.portNumber+" assigned to application "+application);
		}else {
			System.out.println("Unauthorized Access Prohibited!");
		}
	}
	
	public static void main(String[] args) {
		Server mailServer = new Server("myhost.aws.com", "AdminUser", "Admin09876");
		mailServer.password = "AnotherPassword";
		mailServer.assignApplicationPort(4000, "SimpleMail");
	}
}
