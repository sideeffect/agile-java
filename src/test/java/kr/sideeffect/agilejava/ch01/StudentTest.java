package kr.sideeffect.agilejava.ch01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
	
	@Test
	public void testFullTime() {
		Student student = new Student("a");
		assertFalse(student.isFullTime());
	}
	
	@Test
	public void testCredits() {
		Student student = new Student("a");
		assertEquals(0, student.getCredits());
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		student.addCredits(4);
		assertEquals(7, student.getCredits());
	}
}
