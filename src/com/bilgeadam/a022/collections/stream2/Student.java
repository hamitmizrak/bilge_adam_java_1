package com.bilgeadam.a022.collections.stream2;

import java.io.Serializable;

// POJO< Bean <EJB< Management < CDI bean
public class Student implements Serializable {
	
	private static final long serialVersionUID = 2162652015348208517L;
	
	// Nesne değişkeni
	private int studentId;
	private String studentName;
	private String studentSurname;
	
	// Parametresiz contructor
	public Student() {
	}
	
	// parametreli constructor
	public Student(int studentId, String studentName, String studentSurname) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}
	
	// toString
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ "]";
	}
	
	// getter and setter
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentSurname() {
		return studentSurname;
	}
	
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}
	
}
