package com.turing.learning.DSA.HackerRank;

import java.util.List;
import java.util.ArrayList;

public class ArrayReverse {

	public List<Integer> reversePrint(int n, List<Integer> input) 
	{
		List<Integer> result = new ArrayList<Integer>();
		
		for ( int i = n - 1; i >= 0; i-- )
		{
			int num = input.get(i);
			result.add(num);
		}
		String reverse = "";
		for ( Integer i : result )
		{
			String firstString = i.toString();
			reverse += firstString + " " ;
		}
		System.out.print(reverse.trim());
		return result;
	}

}
