package com.assignment.four.program;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.util.BufferedReader;

/**
 * A class which reads JSON file and stores it in object.
 * 
 * @author umesh
 *
 */

public class ReadStudentDetailsFromJson {

	public static void main(String[] args) {

		Gson gson = new Gson();
		try {
			BufferedReader bufferReader = new BufferedReader(
					new FileReader("../Java Assignments/resources/Student.json"));
			StudentDetails student = gson.fromJson(bufferReader, StudentDetails.class);
			System.out.println("Name of Student : " + student.getNameofStudent());
			System.out.println("Roll number of Student :" + student.getRollNumber());
			System.out.println("Age of the Student : " + student.getAgeofStudent());
			System.out.println("Address of the Student: " + student.getAddressofStudent());

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

}
