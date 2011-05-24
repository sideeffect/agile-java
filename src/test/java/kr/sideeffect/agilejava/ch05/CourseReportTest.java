package kr.sideeffect.agilejava.ch05;

import static kr.sideeffect.agilejava.ch04.ReportConstant.NEWLINE;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
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
	
	@Test
	public void testSortStringsInPlace() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Heller");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		java.util.Collections.sort(list);
		assertEquals("Boyle", list.get(0));
		assertEquals("Camus", list.get(1));
		assertEquals("Heller", list.get(2));
		assertEquals("Kafka", list.get(3));
	}
	
	@Test
	public void testSortStringsInNewList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Heller");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		ArrayList<String> sortedList = new ArrayList<String>(list);
		java.util.Collections.sort(sortedList);
		assertEquals("Boyle", sortedList.get(0));
		assertEquals("Camus", sortedList.get(1));
		assertEquals("Heller", sortedList.get(2));
		assertEquals("Kafka", sortedList.get(3));
		
		assertEquals("Heller", list.get(0));
		assertEquals("Kafka", list.get(1));
		assertEquals("Camus", list.get(2));
		assertEquals("Boyle", list.get(3));
	}
}
