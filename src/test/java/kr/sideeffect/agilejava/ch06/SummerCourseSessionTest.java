package kr.sideeffect.agilejava.ch06;

import static org.junit.Assert.*;

import java.util.Date;

import kr.sideeffect.agilejava.ch03.DateUtil;

import org.junit.Test;

public class SummerCourseSessionTest extends SessionTest {
	@Test
	public void testEndDate() throws Exception {
		Date startDate = DateUtil.createDate(2003, 6, 9);
		Session session = createSession("ENGL", "200", startDate);
		Date eightWeeksOut = DateUtil.createDate(2003, 8, 1);
		assertEquals(eightWeeksOut, session.getEndDate());
	}

	@Override
	protected Session createSession(String department, String number, Date startDate) {
		return SummerCourseSession.create(department, number, startDate);
	}
}
