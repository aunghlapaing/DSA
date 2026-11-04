package com.turing.learning.DSA.CSAPP;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RecursiveProcedureTest {
	
	//RecursiveProcedure solution = new PalindromeWithLooping();
	Palindrome solution = new PalindromeWithRecursive();
	
	@Test
	void palindromeTwoCharCase()
	{
		String word = "aa";
		assertTrue(solution.isPalindrome(word));
		
	}
	
	@Test
	void palindromeThreeCharCase()
	{
		String word = "aat";
		assertFalse(solution.isPalindrome(word));
		
	}
	
	@Test
	void palindromeFourCharCase()
	{
		String word = "aata";
		assertFalse(solution.isPalindrome(word));
		
	}
	
	@Test
	void palindromeFiveCase()
	{
		String word = "aataa";
		assertTrue(solution.isPalindrome(word));
		
	}
	
	@Test
	void palindromeEdgeCase()
	{
		String word = "";
		assertFalse(solution.isPalindrome(word));
		
	}
	
	@Test
	void palindromeUpperCase()
	{
		String word = "Aa";
		assertFalse(solution.isPalindrome(word));
		
	}

}
