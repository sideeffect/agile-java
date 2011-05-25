package kr.sideeffect.agilejava.ch01;

import java.util.ArrayList;

public class Student {
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	public static final String IN_STATE = "CO";
	private String name;
	private int credits;
	private String state = "";
	private ArrayList<String> grades = new ArrayList<String>();

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

	public void addGrade(String grade) {
		grades.add(grade);
	}

	public double getGpa() {
		if (grades.isEmpty()) {
			return 0.0;
		}
		double total = 0.0;
		for (String grade : grades) {
			if (grade.equals("A")) {
				total += 4;
			} else if (grade.equals("B")) {
				total += 3;
			} else if (grade.equals("C")) {
				total += 2;
			} else if (grade.equals("D")) {
				total += 1;
			}
		}
		return total / grades.size();
	}
}
