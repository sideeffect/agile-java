package kr.sideeffect.agilejava.ch02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import kr.sideeffect.agilejava.ch01.Student;

public class CourseSession {
	static final String ROSTER_REPORT_HEADER = "---HEADER---";
	static final String ROSTER_REPORT_FOOTER = "---FOOTER--";
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;
	
	public CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
	}

	public CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public void enroll(Student student) {
		students.add(student);
	}

	public Student get(int index) {
		return students.get(index);
	}

	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int numberOfDays = 16 * 7 - 3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getRosterReport() {
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(ROSTER_REPORT_HEADER);
		
		Student student = students.get(0);
		buffer.append(student.getName());
		buffer.append('\n');
		
		student = students.get(1);
		buffer.append(student.getName());
		buffer.append('\n');
		
		buffer.append(ROSTER_REPORT_FOOTER + students.size() + '\n');
		
		return buffer.toString();
	}
	
}
