package kr.sideeffect.agilejava.ch02;

import kr.sideeffect.agilejava.ch01.Student;

public class CourseSession {
	private String department;
	private String number;
	private int numberOfStudents;
	
	public CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
		numberOfStudents = 0;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void enroll(Student student) {
		numberOfStudents = numberOfStudents + 1;
	}
	
}
