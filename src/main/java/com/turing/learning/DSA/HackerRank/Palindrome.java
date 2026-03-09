package com.turing.learning.DSA.HackerRank;

public class Palindrome {

	public boolean isPalindrome(String string) 
	{
		String word = ""; 
		
		for ( char ch : string.toCharArray() )
		{
			if ( Character.isLetterOrDigit(ch) )
			{
				String lowerCh = (ch+"").toLowerCase();
				word += lowerCh;
			}
		}
		System.out.println("Word : " + word);
		
		if ( word.charAt(0) == word.charAt(word.length()-1) )
		{
			return true;
		}
		return false;
	}

}
