package com.gyanoholic.fileutilsdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {
	
	public static void main(String[] args) throws IOException {
//		File file = new File();
		FileReader reader = new FileReader("./src/data.txt");
		BufferedReader br = new BufferedReader(reader);
		String str = null;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
}
