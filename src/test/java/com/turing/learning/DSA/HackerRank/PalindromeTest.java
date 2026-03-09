package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
	
	@Test
	public void baseCase()
	{
		Palindrome palindrome = new Palindrome();
		assertTrue(palindrome.isPalindrome( "A man, a" ));
		
	}

}
