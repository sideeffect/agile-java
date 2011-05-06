package kr.sideeffect.agilejava.ch01;

import org.junit.Test;

public class StudentTest {
	@Test
	public void testCreate() {
		Student student = new Student("Jane Doe");
		String StudentName = student.getName();
	}
}
