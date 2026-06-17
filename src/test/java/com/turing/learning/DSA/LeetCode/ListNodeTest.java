package com.turing.learning.DSA.LeetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ListNodeTest {
	
	@Test
	public void createListNode()
	{
		ListNode list = new ListNode(1, null);
		
		assertEquals( 1, list.getVal() );
		assertEquals( null, list.getNext() );
		
	}
	
	@Test
	public void TwoListNode()
	{
		ListNode list = new ListNode( 1, null );
		
		ListNode list1 =  new ListNode( 2, null );
		
		list.setNext(list1);
		
		assertEquals( 2, list1.getVal() );
		assertEquals( list1, list.getNext() );  
	}

}
