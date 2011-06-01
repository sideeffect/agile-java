package kr.sideeffect.agilejava.ch01;

import java.util.ArrayList;
import java.util.List;

import kr.sideeffect.agilejava.ch05.BasicGradingStrategy;
import kr.sideeffect.agilejava.ch05.GradingStrategy;
import kr.sideeffect.agilejava.ch05.HonorsGradingStrategy;

public class Student {
	public enum Grade { 
		A(4), 
		B(3), 
		C(2), 
		D(1), 
		F(0);
		
		private int points;
		
		Grade(int points) {
			this.points = points;
		}
		
		public int getPoints() {
			return points;
		}
	};
	
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	public static final String IN_STATE = "CO";
	private String name;
	private int credits;
	private String state = "";
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	private GradingStrategy gradingStrategy = new BasicGradingStrategy();
	private String firstName = "";
	private String middleName = "";
	private String lastName;

	public Student(String fullName) {
		this.name = fullName;
		credits = 0;
		List<String> nameParts = split(fullName);
		setName(nameParts);
	}

	private List<String> split(String string) {
		List<String> results = new ArrayList<String>();
		
		StringBuffer word = new StringBuffer();
		int index = 0;
		while (index < string.length()) {
			char ch = string.charAt(index);
			if (ch != ' ') {
				word.append(ch);
			} else {
				if (word.length() > 0 ) {
					results.add(word.toString());
					word = new StringBuffer();
				}
			}
			index++;
		}
		if (word.length() > 0) {
			results.add(word.toString());
		}
		return results;
	}

	private void setName(List<String> nameParts) {
		if (nameParts.size() == 1) {
			this.lastName = nameParts.get(0);
		} else if (nameParts.size() == 2) {
			this.firstName = nameParts.get(0);
			this.lastName = nameParts.get(1);
		} else if (nameParts.size() == 3) {
			this.firstName = nameParts.get(0);
			this.middleName = nameParts.get(1);
			this.lastName = nameParts.get(2);
		}
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

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}
}
