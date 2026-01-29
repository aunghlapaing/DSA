package com.turing.learning.DSA.hash;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HashTest {
	
	HashTable ht = new HashTable();
	
	@Test
	public void testHashFunction()
	{	
		int count = HashTable.hash( "hello", 10 );
		assertEquals(2, count);
	}
	
	@Test 
	public void insertSimpleCase()
	{
		 ht.insert("hello");
		 assertTrue( ht.isContain("hello") ); 
		 
		 
		 ht.insert("Hi");
		 assertTrue( ht.isContain("Hi") );
		 
		 assertFalse( ht.isContain("iH") );
	}

}
