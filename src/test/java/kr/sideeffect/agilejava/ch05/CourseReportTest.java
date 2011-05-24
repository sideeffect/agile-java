package kr.sideeffect.agilejava.ch05;

import static org.junit.Assert.assertEquals;
import static kr.sideeffect.agilejava.ch04.ReportConstant.NEWLINE;
import java.util.Date;
import kr.sideeffect.agilejava.ch02.CourseSession;
import org.junit.Test;

public class CourseReportTest {
	
	@Test
	public void testReport() {
		final Date date = new Date();
		CourseReport report  = new CourseReport();
		report.add(CourseSession.create("ENGL", "101", date));
		report.add(CourseSession.create("CZEC", "200", date));
		report.add(CourseSession.create("ITAL", "410", date));
		
		assertEquals("ENGL 101" + NEWLINE + "CZEC 200" + NEWLINE + "ITAL 410" + NEWLINE, report.text());
	}
}
