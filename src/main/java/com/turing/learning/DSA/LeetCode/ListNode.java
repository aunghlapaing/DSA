package com.turing.learning.DSA.LeetCode;

public class ListNode {
	
	int val;
	ListNode next;

	public ListNode(int i, ListNode next) {
		this.val = i;
		this.next = next;
	}
	
	public int getVal()
	{
		return this.val;
	}
	
	public void setVal(int val)
	{
		this.val = val;
	}
	
	public ListNode getNext()
	{
		return this.next;
	}

	public void setNext(ListNode list1) {
		
		this.next = list1;
		
	}
	
}
