package com.turing.learning.DSA.HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemovedDuplicateLKTest {
	
	HackerRankLinkedList list = new HackerRankLinkedList();
	
	
	@Test
	public void createLinkedListCase()
	{
		// add last
		list.add(1);
		list.add(2);
		list.add(3);
		Node node = list.firstNode;
		assertEquals( 2, node.next.data );
	}
	
	@Test 
	public void removeDuplicateSimpleCase()
	{
		
		list.add(1);
		list.add(1);
		list.add(2);
		
		Node head = list.removeDuplicateItem(list.firstNode);
		
		while ( head.next != null )
		{
			System.out.println( head.data );
			System.out.println( head.next.data );
			assertTrue( head.data != head.next.data );
			head = head.next;
		}
	}

}
