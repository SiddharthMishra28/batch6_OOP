package com.gyanoholic.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
	public static void main(String[] args) {
		Map<String, Student> myStudents = new HashMap<>();
		Student s = new Student();
		s.setRollNo(1);
		s.setFirstName("Sid");
		s.setLastName("Mishra");
		s.setEmail("sid@test.com");
		s.setPhoneNumber("928374657");
		myStudents.put("S123098", s);
		System.out.println(myStudents);
		
		
		// CAR CLASS
		// DECLARE GETTERS AND SETTERS
		// STORE RETRIEVE AND REMOVE 
		// INTO A LIST / SET/ MAP
		// LOG DETAILS INTO CONSOLE
	}
}
