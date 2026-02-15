package com.turing.learning.DSA.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

	public List<Integer> reserseArray(List<Integer> list) 
	{
		List<Integer> result = new ArrayList<Integer>();
		
		int n = list.size();
		
		for ( int i = n - 1; i >= 0; i-- )
		{
			Integer number = list.get(i);
			result.add(number);
		}
		
 		return result;
	}

}
