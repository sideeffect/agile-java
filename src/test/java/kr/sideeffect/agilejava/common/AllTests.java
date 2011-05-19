package kr.sideeffect.agilejava.common;

import junit.framework.Test;
import junit.framework.TestSuite;
import kr.sideeffect.agilejava.ch01.StudentTest;
import kr.sideeffect.agilejava.ch02.CourseSessionTest;
import kr.sideeffect.agilejava.ch03.RosterReporterTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({StudentTest.class, CourseSessionTest.class, RosterReporterTest.class})
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		
		//$JUnit-END$
		return suite;
	}

}
