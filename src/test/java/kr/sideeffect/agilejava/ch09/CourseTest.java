package kr.sideeffect.agilejava.ch09;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import kr.sideeffect.agilejava.ch01.Student;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	private StudentDirectory dir;
	
	@Test
	public void testCreate() throws IOException {
		Course course = new Course("CMSC", "120");
		assertEquals("CMSC", course.getDepartment());
		assertEquals("120", course.getNumber());
	}
}
