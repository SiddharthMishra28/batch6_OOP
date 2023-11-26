package com.gyanoholic.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlerExample {
	
	public static void main(String[] args) throws FileNotFoundException {
//		try {
//			System.out.println(1/0);
//		}catch(ArithmeticException e) {
//			System.out.println("Error Occurred Please check Input "+e.getMessage());
//		}
		/**
		 * try{
		 *  ....
		 *  .....
		 *  }catch(Exception e){
		 *   ......
		 *  }
		 *
		 */
		File f = new File("abcd.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("I will always execute despite scenarios");
		}
	}
}
