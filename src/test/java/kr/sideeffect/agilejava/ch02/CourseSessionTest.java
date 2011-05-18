package kr.sideeffect.agilejava.ch02;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import kr.sideeffect.agilejava.ch01.Student;

import org.junit.Before;
import org.junit.Test;

public class CourseSessionTest {
	private CourseSession session;
	
	@Before
	public void setUp() {
		session = new CourseSession("ENGL", "101");
	}
	
	@Test
	public void testCreate() {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
	}
	
	@Test
	public void testEnrollStudents() {
		Student student1 = new Student("Cain DiVoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		
		Student student2 = new Student("Coralee DeVaughn");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}
}
