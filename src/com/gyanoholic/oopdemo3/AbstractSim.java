package com.gyanoholic.oopdemo3;

public abstract class AbstractSim {
	
	String networkProvider;
	String simIdentificationNumber;
	String phoneNumber;
	
	void initiateConnection() {
		// IMPLEMENTATION CODE
	}
	
	void dialToVoice() {
		// IMPLEMENTATION CODE
	}
	
	abstract void sendSms(String smsText, String number);
	
}
