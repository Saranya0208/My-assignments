package org.system;

public class Student1 {
	private int id;

	public void getStudentInfo(int id) {

		System.out.println(id);

	}

	public void getStudentInfo(int id,String name) {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);

	}

	public void getStudentInfo(String Phone,String email) {
		System.out.println("Phone: " + Phone);
		System.out.println("email: " + email);
	}

	public static void main(String[] args) {
		Student1 stud = new Student1();
		stud.getStudentInfo(12345);
		stud.getStudentInfo(456,"Saranya");
		stud.getStudentInfo("9003181321","rsaranya.rajan@gmail.com");
	}

}
