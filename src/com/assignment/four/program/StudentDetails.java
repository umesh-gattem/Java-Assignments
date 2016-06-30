package com.assignment.four.program;

import java.io.Serializable;

/**
 * 
 * A studentDetials class containing student details like roll no, name, age,
 * address. This class implements Serializable class so that the object can be
 * stored into file.
 * 
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 *
 */

public class StudentDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rollNumber;
	int ageofStudent;
	String nameofStudent;
	String addressofStudent;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAgeofStudent() {
		return ageofStudent;
	}

	public void setAgeofStudent(int ageofStudent) {
		this.ageofStudent = ageofStudent;
	}

	public String getNameofStudent() {
		return nameofStudent;
	}

	public void setNameofStudent(String nameofStudent) {
		this.nameofStudent = nameofStudent;
	}

	public String getAddressofStudent() {
		return addressofStudent;
	}

	public void setAddressofStudent(String addressofStudent) {
		this.addressofStudent = addressofStudent;
	}

}
