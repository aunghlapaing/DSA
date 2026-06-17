package com.turing.learning.DSA.LeetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SortedListNodeMergeTest {
	
	@Test
	public void simpleCase()
	{
		SortedListNodeMerge list = new SortedListNodeMerge();
		
		ListNode list1 = new ListNode( 1, null );
		ListNode list2 = new ListNode( 2, null );
		
		ListNode result = list.merge( list1, list2 );
		
		assertEquals( 1, result.getVal() );
		assertEquals( list2, result.getNext() );
		
	}
	
	
	@Test
	public void FourListNodeCase()
	{
		SortedListNodeMerge list = new SortedListNodeMerge();
		
		ListNode list1 = new ListNode( 1, null );
		ListNode list11 = new ListNode ( 2, null );
		list1.setNext(list11);
		
		ListNode list2 = new ListNode( 2, null );
		ListNode list21 = new ListNode ( 3, null );
		list2.setNext(list21);
		
		ListNode result = list.merge( list1, list2 );
		
		ListNode result1 = result.getNext();
		ListNode result2 = result1.getNext();
		ListNode result3 = result2.getNext();
		
		assertEquals( 1, result.getVal() );
		assertEquals( result1, result.getNext() );
		
		assertEquals( 2, result1.getVal() );
		assertEquals( result2, result1.getNext() );
		
		assertEquals( 2, result2.getVal() );
		assertEquals( result3, result2.getNext() );
		
		assertEquals( 3, result3.getVal() );
		assertEquals( null, result3.getNext() );
		
	}
	
	@Test
	public void nullListNodeCase()
	{
		SortedListNodeMerge list = new SortedListNodeMerge();
		
		ListNode list1 = null;
		ListNode list2 = new ListNode ( 0, null );
		
		ListNode result = list.merge( list1, list2 );
		
		assertEquals( 0, result.getVal() );
		assertEquals( null, result.getNext() );
		
	}

}
