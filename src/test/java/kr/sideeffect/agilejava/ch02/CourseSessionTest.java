package kr.sideeffect.agilejava.ch02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseSessionTest {
	@Test
	public void testCreate() {
		CourseSession session = new CourseSession("ENGL", "101");
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
	}
}
