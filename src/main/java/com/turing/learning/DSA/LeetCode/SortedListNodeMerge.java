package com.turing.learning.DSA.LeetCode;

public class SortedListNodeMerge {
	
	public ListNode merge(ListNode list1, ListNode list2) {
		
		if( list1 == null )
		{
			return list2;
		}
		else if( list2 == null )
		{
			return list1;
		}
		else
		{
			ListNode head = list1;
			while ( list1 != null || list2 != null )  
			{
				ListNode next1 = list1.next;
				ListNode next2 = list2.next;
				
				list1.next = list2;
				
				if ( next1 == null )
				{
					break;
				}
				
				list2.next = next1;
				
				list1 = next1;
				list2 = next2;
			}
			
			ListNode sortedListNode = sort( head );
			
			return sortedListNode;
			
		}
		
	}

	private ListNode sort(ListNode head) {
		
		ListNode firstNode = head;
		
		ListNode nextNode = head.next;
		
		ListNode temp = null;
		
		while( firstNode != null && nextNode != null )
		{
			ListNode nextNext = nextNode.next;
			if( firstNode.val > nextNode.val )
			{
				temp = firstNode;
				firstNode = nextNode;
				firstNode.next = nextNode;
						
				nextNode = temp;
				nextNode.next = nextNext;
				
			}
			firstNode = nextNode;
			nextNode = nextNext;
			
		}
		
		return firstNode;
	}

}
