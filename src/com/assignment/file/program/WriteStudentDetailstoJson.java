package com.assignment.file.program;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

/**
 * A class which writes Json object into file using Gson..
 * 
 * @author umesh
 * 
 * @since 01-07-2016
 *
 */
public class WriteStudentDetailstoJson {

	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
		student.setNameofStudent("Santhosh");
		student.setRollNumber(513);
		student.setAgeofStudent(27);
		student.setAddressofStudent("United States");
		Gson gson = new Gson();
		String json = gson.toJson(student);
		try {
			FileWriter writer = new FileWriter("../Java Assignments/resources/Student.json");
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
		System.out.println(json);
	}
}