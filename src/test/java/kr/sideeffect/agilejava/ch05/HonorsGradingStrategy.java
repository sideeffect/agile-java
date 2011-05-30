package kr.sideeffect.agilejava.ch05;

import kr.sideeffect.agilejava.ch01.Student.Grade;

public class HonorsGradingStrategy implements GradingStrategy {

	public int getGradePointsFor(Grade grade) {
		int points = basicGradePointsFor(grade);
		if (points > 0) {
			points += 1;
		}
		return points;
	}

	private int basicGradePointsFor(Grade grade) {
		switch (grade) {
			case A: return 4;
			case B: return 3;
			case C: return 2;
			case D: return 1;
			default: return 0;
		}
	}

}
