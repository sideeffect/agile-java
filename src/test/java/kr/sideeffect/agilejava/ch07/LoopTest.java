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
	
	@Test
	public void testFibonacci() {
		assertEquals(0, fib(0));
		assertEquals(1, fib(1));
		assertEquals(1, fib(2));
		assertEquals(2, fib(3));
		assertEquals(3, fib(4));
		assertEquals(5, fib(5));
		assertEquals(8, fib(6));
		assertEquals(13, fib(7));
		assertEquals(21, fib(8));
		assertEquals(34, fib(9));
		assertEquals(55, fib(10));
	}

	private int fib(int x) {
		if (x == 0) return 0;
		if (x == 1) return 1;
		int fib = 0;
		int nextFib = 1;
		int index = 0;
		int temp;
		do {
			temp = fib + nextFib;
			fib = nextFib;
			nextFib = temp;
		} while(++index < x);
		return fib;
	}
}
