package kr.sideeffect.agilejava.ch06;

import java.util.Date;

import kr.sideeffect.agilejava.ch02.CourseSession;

public class SummerCourseSession extends CourseSession {
	private SummerCourseSession(String department, String number, Date startDate) {
		super(department, number, startDate);
	}
	
	public static SummerCourseSession create(String department, String number, Date startDate) {
		return new SummerCourseSession(department, number, startDate);
	}
	
	@Override
	protected int getSessionLength() {
		return 8;
	}
	
}
