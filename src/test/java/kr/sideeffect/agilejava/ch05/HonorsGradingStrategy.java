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
			if (grade == Grade.A) return 4;
			if (grade == Grade.B) return 3;
			if (grade == Grade.C) return 2;
			if (grade == Grade.D) return 1;
			return 0;
	}

}