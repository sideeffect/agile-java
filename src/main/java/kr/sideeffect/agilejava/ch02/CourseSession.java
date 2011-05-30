package kr.sideeffect.agilejava.ch02;

import java.util.Date;

import kr.sideeffect.agilejava.ch06.Session;

public class CourseSession extends Session {
	private static int count;
	
	protected CourseSession(String department, String number, Date startDate) {
		super(department, number, startDate);
		CourseSession.incrementCount();
	}
	
	public static void resetCount() {
		count = 0;
	}
	
	private static void incrementCount() {
		++count;
	}

	public static int getCount() {
		return count;
	}
	
	public static CourseSession create(String department, String number, Date startDate) {
		return new CourseSession(department, number, startDate);
	}
	
	@Override
	protected int getSessionLength() {
		return 16;
	}

}
