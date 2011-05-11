package kr.sideeffect.agilejava.ch02;

import static org.junit.Assert.assertEquals;
import kr.sideeffect.agilejava.ch01.Student;

import org.junit.Test;

public class CourseSessionTest {
	@Test
	public void testCreate() {
		CourseSession session = new CourseSession("ENGL", "101");
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
	}
	
	@Test
	public void testEnrollStudents() {
		CourseSession session = new CourseSession("ENGL", "101");
		
		Student student1 = new Student("Cain DiVoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		
		Student student2 = new Student("Cain DiVoe");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
	}
}
