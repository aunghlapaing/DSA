package com.turing.learning.DSA.JavaHackerRank;

import java.util.*;

public class WieredSum {

	public List<String> addFunc(List<Integer> list) {
		
		List<String> result = new ArrayList<String>();
		
		int size = list.size();
		
		for( int i = 0; i < size-1; i++ )
		{
			int add = 0;
			String sumString = "";
			for( int j = 0; j <= i+1; j++ )
			{
				add += list.get(j);
				sumString += list.get(j)+"+";
			}
			
			if( i != (size/2) - 1 || i == 0 )
			{
				String trimString = sumString.replaceAll("\\++$", "");
				String finalString = trimString+"="+add;
				result.add(finalString);
			}
		}
		
		return result;
	}

}
