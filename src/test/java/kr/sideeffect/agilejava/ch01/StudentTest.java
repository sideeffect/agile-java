package kr.sideeffect.agilejava.ch01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
	@Test
	public void testCreate() {
		final String firstStudentName = "Jane Doe";
		Student student = new Student(firstStudentName);
		assertEquals(firstStudentName, student.getName());

		final String secondStudentName = "Joe Blow";
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
	}
}
