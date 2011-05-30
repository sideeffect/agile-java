package kr.sideeffect.agilejava.ch05;

import kr.sideeffect.agilejava.ch01.Student.Grade;

abstract public class BasicGradingStrategy implements GradingStrategy {
	abstract public int getGradePointsFor(Grade grade);
	
	protected int basicGradePointsFor(Grade grade) {
		switch (grade) {
			case A: return 4;
			case B: return 3;
			case C: return 2;
			case D: return 1;
			default: return 0;
		}
	}
}
