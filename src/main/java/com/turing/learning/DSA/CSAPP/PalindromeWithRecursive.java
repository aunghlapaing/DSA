package com.turing.learning.DSA.CSAPP;

public class PalindromeWithRecursive extends Palindrome {

	@Override
	boolean isPalindrome(String word) {
		
		int start = 0;
		int end = word.length() - 1;
		
		
		if( word.isEmpty())
		{
			return false;
			
		}
		else
		{
			return recursive(word, start, end);
		}
	}
	
	private boolean recursive(String word, int start, int  end)
	{
		
		if(start == end || start > end)
		{
			return true;
		}
		else
		{
			if(word.charAt(start) != word.charAt(end))
			{
				return false;
			}
			
			return recursive(word, start + 1, end - 1);
		}
		
	}

}
