package com.turing.learning.DSA.DataStructure;

import com.turing.learning.DSA.LinkedList.LinkedList;
import com.turing.learning.DSA.LinkedList.Node;

public class StackWithLinkedList extends LinkedList {
	
	int size;

	StackWithLinkedList() 
	{
		super();
		
	}

	public void push(int item) 
	{
		this.addLast(item);
		this.size++;
		
	}

	public int size() 
	{
		
		return this.size;
	}

	public Integer peek() 
	{
		
		return this.getLastNode().getValue();
	}

	public void delete()
	{
		Node current = this.getFirstNode();
		Node previous = null;
		
		while ( current.getNext() != null )
		{
			previous = current;
			current = current.getNext();
		}
		if ( previous.next != null )
		{
			previous.setNext(null);
		}
		super.lastNode = previous;
	}
	
	public void pop() 
	{
		this.delete();	
		this.size--;
	
	}

}
