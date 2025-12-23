package com.turing.learning.DSA.LinkedList;

public class SortedList extends LinkedList {

	public void add(int item) 
	{
		if ( firstNode == null )
		{
			this.addFirst(item);
		}
		else
		{
			Node current = this.getFirstNode();
			Node previous = null;
			
			//compare and traverse
			while ( current != null )
			{
				if ( current.getValue() > item )
				{
					break; //  It's gonna break the while loop as well
				}
				previous = current;
				current = current.next;
			}
			
			Node insertNode = new Node(item);
			insertNode.setNext(current);
			
			// change firstNode
			if ( previous == null ) // single node
			{
				super.firstNode = insertNode;
			}
			else
			{
				previous.setNext(insertNode);
			}
		}
		
	}

}
