package org.system;

public class Student extends Department {
	public void StudentName() {
		System.out.println("Saranya");

	}
	public void StudentDepartment() {
		System.out.println("CSE");

	}
	public void StudentId() {
		System.out.println("10445");

	}

	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.departmentName();
		std.StudentName();
		std.StudentDepartment();
		std.StudentId();


	}

}
