package com.turing.learning.DSA.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryConvertor {

	public List<Integer> decimalToBinary(int decimal) 
	{
		List<Integer> result = new ArrayList<Integer>();
		
		while ( decimal > 0 )
		{
			int binary = decimal % 2;
			result.add(binary);
			
			decimal = decimal / 2;
		}
		Collections.reverse(result);
		
		int count = 0;
		int max = 0;
		for ( Integer binary : result )
		{
			if ( binary > 0 )
			{
				count++;
			}
			else
			{
				count = 0;
			}
			
			if ( count > max )
			{
				max = count;
			}
		}
		System.out.println("Consetuive of 1 :" + max);
		return result;
	}

}
