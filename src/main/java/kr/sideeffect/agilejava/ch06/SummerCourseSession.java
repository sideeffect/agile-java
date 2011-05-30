package kr.sideeffect.agilejava.ch06;

import java.util.Date;

public class SummerCourseSession extends Session {
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
