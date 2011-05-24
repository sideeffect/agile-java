package kr.sideeffect.agilejava.ch05;

import static kr.sideeffect.agilejava.ch04.ReportConstant.NEWLINE;

import java.util.ArrayList;
import java.util.Collections;

import kr.sideeffect.agilejava.ch02.CourseSession;

public class CourseReport {
	private ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();
	
	public void add(CourseSession session) {
		sessions.add(session);
	}

	public String text() {
		Collections.sort(sessions);
		StringBuilder builder = new StringBuilder();
		for (CourseSession session: sessions) {
			builder.append(session.getDepartment() + " " + session.getNumber() + NEWLINE);
		}
		return builder.toString();
	}
}
