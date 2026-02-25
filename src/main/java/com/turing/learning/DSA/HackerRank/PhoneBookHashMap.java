package com.turing.learning.DSA.HackerRank;

import java.util.HashMap;

public class PhoneBookHashMap {

	public int searchPhoneNumber(HashMap<String, Integer> map, String name) 
	{
		int result = 0;
		if ( map.containsKey(name) )
		{
			result = map.get(name);
			System.out.println( name + "=" + map.get(name) );
		}
		else
		{
			System.out.println("Not found");
		}
		return result;
	}

}
