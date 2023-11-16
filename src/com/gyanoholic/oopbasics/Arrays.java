package com.gyanoholic.oopbasics;

public class Arrays {
	
	// int[] variable - Array which holds bunch of integers
	// String[] stringArrray - Array which holds bunch of Strings together
	
	public static void main(String[] args) {
		String[] myStudents = {"kiran", "mrutyunjay", "ramesh", "sid"};
								// 0        1             2
		int[] rollNumbers = { 10, 11, 12, 13 };
							 //0  1   2    3
		String[] nextBatchStudents = new String[10];
		
		for(int i=0; i<nextBatchStudents.length; i++) {
			nextBatchStudents[i] = "sid";
		}

//		--------------------------------
//		| 1,2,3,4,5,5
//		| 3,4,5,6,7,8
//		| 4,5,7,3,5,8
//		|
//		|
//		|
//		|
	    String[][] studentsData = {
	    		{ "firstname", "lastName", "email", "age" },
	    		{ "sid", "mishra", "sid@test.com", "32", "GOOD STUDENT" }
	    };
	    for(int i=0; i<studentsData.length; i++) {
	    	for(int j=0; j<studentsData[i].length; j++) {
	    		System.out.println(studentsData[i][j]);
	    	}
	    }
		
	}
}
