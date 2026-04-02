package com.turing.learning.DSA.HackerRank;

import java.util.List;
import java.util.ArrayList;

public class ArrayReverse {

	public List<Integer> reversePrint(List<Integer> input) 
	{
		List<Integer> result = new ArrayList<Integer>();
		int n = input.size();
		String reverse = "";
		
		for ( int i = n - 1; i >= 0; i-- )
		{
			Integer num = input.get(i);
			result.add(num);
			
			// This code is used to print the reverse order of array because I don't want to use iteration.
			String firstString = num.toString();
			reverse += firstString + " " ;
		}
		
		System.out.print(reverse.trim());
		
		return result;
	}

}
