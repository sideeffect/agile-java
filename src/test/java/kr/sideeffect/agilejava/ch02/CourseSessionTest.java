package kr.sideeffect.agilejava.ch02;

import static org.junit.Assert.*;

import java.util.Date;

import kr.sideeffect.agilejava.ch03.DateUtil;
import kr.sideeffect.agilejava.ch06.Session;
import kr.sideeffect.agilejava.ch06.SessionTest;

import org.junit.Test;

public class CourseSessionTest extends SessionTest {
	
	@Test
	public void testCourseDates() {
		Date startDate = DateUtil.createDate(2003, 1, 6);
		Session session = createSession("ENGL", "200", startDate);
		Date sixteenWeeksOut = DateUtil.createDate(2003, 4, 25);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}
	
	@Test
	public void testCount() {
		CourseSession.resetCount();
		createSession("", "", new Date());
		assertEquals(1, CourseSession.getCount());
		createSession("", "", new Date());
		assertEquals(2, CourseSession.getCount());		
	}

	@Override
	protected Session createSession(String department, String number, Date startDate) {
		return CourseSession.create(department, number, startDate);
	}
}
