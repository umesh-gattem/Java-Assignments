package com.assignment.four.program;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * This is deserializable class which deserializes the object and shows the
 * content of the object.
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 *
 */

public class DeserializableForStudent {

	public static void main(String[] args) throws IOException {

		StudentDetails student = null;

		try {
			FileInputStream inputFile = new FileInputStream("/home/umesh/Documents/student.ser");
			ObjectInputStream object = new ObjectInputStream(inputFile);
			student = (StudentDetails) object.readObject();
			object.close();

		} catch (IOException e) {
			System.out.println("IO exception");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}

		System.out.println("Deserialization is done: ");
		System.out.println("Student roll no: " + student.rollNumber);
		System.out.println("Student name is : " + student.nameofStudent);
		System.out.println("Student age is : " + student.ageofStudent);
		System.out.println("Student address is : " + student.addressofStudent);

	}

}
