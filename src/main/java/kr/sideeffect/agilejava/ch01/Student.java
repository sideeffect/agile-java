package kr.sideeffect.agilejava.ch01;

import java.util.ArrayList;

import kr.sideeffect.agilejava.ch05.BasicGradingStrategy;
import kr.sideeffect.agilejava.ch05.GradingStrategy;
import kr.sideeffect.agilejava.ch05.HonorsGradingStrategy;

public class Student {
	public enum Grade { A, B, C, D, F };
	
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	public static final String IN_STATE = "CO";
	private String name;
	private int credits;
	private String state = "";
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	private GradingStrategy gradingStrategy = new BasicGradingStrategy();

	public Student(String name) {
		this.name = name;
		credits = 0;
	}

	public String getName() {
		return this.name;
	}

	public boolean isFullTime() {
		return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
	}

	public int getCredits() {
		return credits;
	}

	public void addCredits(int credits) {
		this.credits += credits;
	}

	public boolean isInState() {
		return state.equals(Student.IN_STATE);
	}

	public void setState(String state) {
		this.state = state;
	}

	public void addGrade(Grade grade) {
		grades.add(grade);
	}

	public double getGpa() {
		if (grades.isEmpty()) {
			return 0.0;
		}
		double total = 0.0;
		for (Grade grade : grades) {
			total += gradingStrategy.getGradePointsFor(grade);
		}
		return total / grades.size();
	}

	public Student createHonorsStudent(Student.Grade grade) {
		Student student = new Student("a");
		student.setGradingStrategy(new HonorsGradingStrategy());
		student.addGrade(grade);
		return student;
	}
	
	public Student createHonorsStudent() {
		Student student = new Student("a");
		student.setGradingStrategy(new HonorsGradingStrategy());
		return student;
	}

	private void setGradingStrategy(GradingStrategy gradingStrategy) {
		this.gradingStrategy  = gradingStrategy;
	}
}
