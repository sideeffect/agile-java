package kr.sideeffect.agilejava.ch05;

import kr.sideeffect.agilejava.ch01.Student.Grade;

public class RegularGradingStrategy extends BasicGradingStrategy {

	public int getGradePointsFor(Grade grade) {
		return basicGradePointsFor(grade);
	}

}
