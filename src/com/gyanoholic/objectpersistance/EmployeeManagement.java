package com.gyanoholic.objectpersistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeManagement {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		List<Employee> employees = new ArrayList<>();
//		
//		Employee emp1 = new Employee();
//		emp1.setId(UUID.randomUUID().toString());
//		emp1.setFirstName("Siddharth");
//		emp1.setLastName("Mishra");
//		emp1.setEmail("sid@test.com");
//		emp1.setDepartment("IT");
//		
//		employees.add(emp1);
		File file = new File("./employees.txt");
//		FileOutputStream fos = new FileOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(employees);
//		oos.flush();
//		oos.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Employee> fileData = (List<Employee>)ois.readObject();
		System.out.println(fileData.get(0).getEmail());
		
		// CREATE A CLASS CALLED AS PRODUCT
		// CREATE ANOTHER CLASS CALLED AS CATEGORY 
		// ESTABLISH HAS-A RELATIONSHIP BETWEEN PRODUCT AND CATEGORY
		// SAVE THE OBJECT INTO FILE USING OBJECTOUTPUTSTREAM
		// READ THE OBJECT BACK FROM FILE USING OBJECTINPUTSTREAM
		
		
	}
}
