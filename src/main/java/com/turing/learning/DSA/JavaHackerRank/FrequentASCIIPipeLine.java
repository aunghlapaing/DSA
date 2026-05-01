package com.turing.learning.DSA.JavaHackerRank;

public class FrequentASCIIPipeLine {
	
	public char frequentASCII( String input )
	{
		//one ASCII character is 7 bits, so it has 128 character
		int[] ASCII = new int[128];
		
		int largestIndex = 0;
		
		for( char ch : input.toCharArray() )
		{
			ASCII[ch]++; // sign 1 into ch index
			if( ASCII[largestIndex] < ASCII[ch] )
			{
				largestIndex = ch; // not need to cast the character into int
			}
		}
		char result = (char) largestIndex;
		return result;
	}

}
