package com.assignment.four.program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * This class sets all details of object and serialize the object and then it
 * stores(writes) into the file . The file should be saved with ".ser" extension
 * and this file can't be opened.If you want to open the file you have to
 * deserialize the file
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 *
 */

public class SerializableForStudent {

	public static void main(String[] args) throws IOException {
		StudentDetails student = new StudentDetails();
		student.setRollNumber(34);
		student.setAgeofStudent(21);
		student.setNameofStudent("Umesh");
		student.setAddressofStudent("Bangalore");
		try {
			FileOutputStream outputFile = new FileOutputStream("/home/umesh/Documents/student.ser");
			ObjectOutputStream object = new ObjectOutputStream(outputFile);
			object.writeObject(student);
			object.close();
			System.out.println("object copied to File");
		} catch (IOException e) {
			System.out.println("IO exception");
		}

	}

}
