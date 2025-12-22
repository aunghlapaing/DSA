package com.turing.learning.DSA.LinkedList;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class SortedListTest {
	
	SortedList list = new SortedList();
	
	@Test
	public void sortSimpleCase()
	{
		list.add(10);
		list.add(20);
		list.add(30);
		
		// [30, 20, 10]
		
		Iterator iterator = list.iterator();
		
		assertEquals( 10, ((Node)iterator.next()).getValue() );
		assertEquals( 20, ((Node)iterator.next()).getValue() );
		assertEquals( 30, ((Node)iterator.next()).getValue() );

	}

}
