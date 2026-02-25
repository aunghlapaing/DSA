package com.turing.learning.DSA.HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

public class PhoneBookHashMapTest {
	
	PhoneBookHashMap phoneBook = new PhoneBookHashMap();
	
	HashMap<String, Integer> map = new HashMap<>();
	
	/*
	sam 99912222
	tom 11122222
	harry 12299933
	*/
	
	public PhoneBookHashMapTest()
	{
		map.put("sam", 99912222);
		map.put("tom", 11122222);
		map.put("harry", 12299933);
	}
	
	@Test 
	public void simpleInputCase()
	{
		String name1 = "sam";
		int phone1 = phoneBook.searchPhoneNumber(map, name1);
		assertEquals( 99912222, phone1 );
	}

}
