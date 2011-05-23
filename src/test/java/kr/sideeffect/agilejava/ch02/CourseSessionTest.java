package kr.sideeffect.agilejava.ch02;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import kr.sideeffect.agilejava.ch01.Student;
import kr.sideeffect.agilejava.ch03.DateUtil;

import org.junit.Before;
import org.junit.Test;

public class CourseSessionTest {
	private CourseSession session;
	private Date startDate;
	
	@Before
	public void setUp() {
		startDate = DateUtil.createDate(2003, 1, 6);
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
		Date sixteenWeeksOut = DateUtil.createDate(2003, 4, 25);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}
	
	@Test
	public void testRosterReport() {
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = session.getRosterReport();
		assertEquals(CourseSession.ROSTER_REPORT_HEADER + "A" + CourseSession.NEWLINE + "B" + CourseSession.NEWLINE + CourseSession.ROSTER_REPORT_FOOTER + "2" + CourseSession.NEWLINE, rosterReport);
	}
	
	@Test
	public void testCount() {
		CourseSession.resetCount();
		createCourseSession();
		assertEquals(1, CourseSession.getCount());
		createCourseSession();
		assertEquals(2, CourseSession.getCount());		
	}

	private CourseSession createCourseSession() {
		return new CourseSession("ENGL", "101", startDate);
	}
}
