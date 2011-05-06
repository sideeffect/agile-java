package kr.sideeffect.agilejava.ch01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
	@Test
	public void testCreate() {
		Student student = new Student("Jane Doe");
		String studentName = student.getName();
		assertEquals("Jane Doe", studentName);

		Student secondStudent = new Student("Joe Blow");
		String secondStudentName = secondStudent.getName();
		assertEquals("Joe Blow", secondStudentName);
		
		assertEquals("Jane Doe", student.getName());
	}
}
