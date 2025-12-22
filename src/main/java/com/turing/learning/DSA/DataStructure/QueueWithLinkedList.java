package com.turing.learning.DSA.DataStructure;

import com.turing.learning.DSA.LinkedList.LinkedList;
import com.turing.learning.DSA.LinkedList.Node;

public class QueueWithLinkedList extends LinkedList {
	
	int size;
	
	QueueWithLinkedList()
	{
		super();
	}

	public void enQueue(int item) 
	{
		// FIFO
		this.addFirst(item);
		this.size++;
	}

	public int size() 
	{
		
		return this.size;
	}

	public int peek() {
		
		return this.getLastNode().getValue();
	}

	public void delete()
	{
		// delete first [ 20, 10 ]
		Node last = this.getLastNode();
		Node current = this.getFirstNode();
		Node previous = null;
		
		while ( current.getNext() != null )
		{
			previous = current;
			current = current.next;
		}
		
		if ( previous != null )
		{
			previous.setNext(null);
		}
		
		super.lastNode = previous;
		
	}
	
	public void deQueue() 
	{
		this.delete();
		this.size--;
		
	}

}
