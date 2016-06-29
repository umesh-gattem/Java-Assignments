package com.assignment.four.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll number");
		String rollNo = br.readLine();
		int rollNumber = Integer.parseInt(rollNo);
		System.out.println("Enter the name of person");
		String nameofPerson = br.readLine();
		System.out.println("Enter the age of person");
		String age = br.readLine();
		int ageofPerson = Integer.parseInt(age);
		System.out.println("Enter the address of person");
		String address = br.readLine();
	}

}
