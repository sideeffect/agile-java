package kr.sideeffect.agilejava.ch07;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoopTest {
	@Test
	public void testPalindrome() throws Exception {
		assertFalse(isPalindrome("abcdef"));
		assertFalse(isPalindrome("abccda"));
		assertTrue(isPalindrome("abccba"));
		assertFalse(isPalindrome("abcxba"));
		assertTrue(isPalindrome("a"));
		assertTrue(isPalindrome("aa"));
		assertFalse(isPalindrome("ab"));
		assertTrue(isPalindrome(""));
		assertTrue(isPalindrome("aaa"));
		assertTrue(isPalindrome("aba"));
		assertTrue(isPalindrome("abbba"));
		assertTrue(isPalindrome("abba"));
		assertFalse(isPalindrome("abbaa"));
		assertFalse(isPalindrome("abcda"));
	}

	public static boolean isPalindrome(String string) {
		for (int forward = 0, backward = string.length() -1; forward < string.length(); forward++, backward--) {
			if (string.charAt(forward) != string.charAt(backward)) {
				return false;
			}
		}
		return true;
	}
}
