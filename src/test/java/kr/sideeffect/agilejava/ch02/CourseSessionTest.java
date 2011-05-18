package kr.sideeffect.agilejava.ch02;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import kr.sideeffect.agilejava.ch01.Student;

import org.junit.Before;
import org.junit.Test;

public class CourseSessionTest {
	private CourseSession session;
	private Date startDate;
	
	private Date createDate(int year, int month, int date) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month -1);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
	}
	
	@Before
	public void setUp() {
		startDate = createDate(2003, 1, 6);
		session = new CourseSession("ENGL", "101", startDate);
	}
	
	@Test
	public void testCreate() {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
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
	
	@Test
	public void testCourseDates() {
		Date sixteenWeeksOut = createDate(2003, 4, 25);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}
}
