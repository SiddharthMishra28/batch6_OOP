package com.gyanoholic.inheritancedemo;

/**
 * standard blueprint of messaging
 */
public class InternetMessage {
	
	String protocol;
	String medium;
	String messageContent;
	String sender;
	String receiver;
	
	public void setProtocol(String p) {
		protocol = p;
	}
	
	public void setMessageBody(String m) {
		messageContent = m;
	}
	
	public void setSender(String s) {
		sender = s;
	}
	
	public void setReceiver(String r) {
		receiver = r;
	}
	
}
