package com.turing.learning.DSA.CSAPP;

public class PalindromeWithLooping extends RecursiveProcedure {

	@Override
	boolean isPalindrome(String word) {
		
		if(word.isEmpty())
		{
			return false;
		}
		else
		{
			for(int i = 0; i <= word.length() - 1; i++)
			{	
				char ch = word.charAt(i);
				System.out.println("First Loop is here: "+ ch);
				for(int j = word.length()-1; j >= 0; j--)
				{
					if(ch != word.charAt(j) || word.isEmpty())
					{
						return false;
					}
				}
			}

			return true;
		}
		
	}
}
