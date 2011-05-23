package kr.sideeffect.agilejava.ch01;

public class Student {
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	private String name;
	private int credits;

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
}
