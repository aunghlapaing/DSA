package com.turing.learning.DSA.LinkedList;

import java.util.Iterator;

public class LinkedList implements Iterable {
	
	protected Node firstNode;
	protected Node lastNode;
	
	protected LinkedList()
	{
		
	}
	
	protected Node getFirstNode()
	{
		return this.firstNode;
	}
	
	protected Node getLastNode()
	{
		return this.lastNode;
	}
	
	protected LinkedList(Node node)
	{
		this.firstNode = node;
		this.lastNode = node;
	}

	public void addFirst(int item) 
	{
		Node first = new Node(item);
		this.addFirst(first);
	}
	
	protected void addFirst(Node node)
	{
		if( this.firstNode == null )
		{
			this.firstNode = node;
			this.lastNode = node;
		}
		else
		{
			node.setNext(this.firstNode);
			this.firstNode = node;
		}
	}
	
	public void addLast(int item) 
	{
		Node last = new Node(item);
		this.addLast(last);
	}
	
	protected void addLast(Node node)
	{
		if ( this.lastNode == null && this.firstNode == null ) //empty case
		{
			this.lastNode = node;
			this.firstNode = node;
		}
		else
		{
			this.lastNode.setNext(node);
			this.lastNode = node;
		}
	}

	@Override
	public Iterator iterator() {
		
		return new ListIterator();
	}
	
	class ListIterator implements Iterator
	{
		
		Node current;
		
		ListIterator()
		{
			this.current = firstNode;
		}

		@Override
		public boolean hasNext() 
		{
			return current != null;
		}

		@Override
		public Node next() 
		{			
			Node temp = current;
			// Traverse
			if ( current != null )
			{
				current = current.next;
				
			}
			return temp;
		}	
	}
	
	public Node find(int item) 
	{
		Node current = this.firstNode;
		
		while ( current != null )
		{
			if ( current.getValue() == item )
			{
				return current;
			}
			current = current.next;
		}
		return null;

	}
	
	public Node delete(int item) 
	{
		Node previousNode = null;
		Node currentNode = this.firstNode;
		Node deleteNode = null;
		while ( currentNode != null )
		{
			if ( currentNode.getValue() == item ) // delete item found
			{
				deleteNode = currentNode;
				if ( this.firstNode == currentNode ) // first Node
				{
					this.firstNode = deleteNode.next; // first Node change
					return deleteNode;
				}
				else if ( previousNode != null ) // middle && last
				{
					previousNode.next = deleteNode.next; // if deleteNode.next is null, previous.next is last node.
					return deleteNode;
				}
			}	
			// traverse
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.addLast(30);
		list.addFirst(10);
		list.addFirst(20);
		
		//  Before delete
		//  [ 20 -> 10 -> 30 ]

		int item = ((Node)list.delete(20)).getValue();
		
		Iterator iterator = list.iterator();
		
		//  After delete
		//  [ 10 -> 30 ]
        
		System.out.println("Delete Node:" + item);
		
		System.out.println("First Node:" +((Node) iterator.next()).getValue());
		System.out.println("Second Node:" +((Node) iterator.next()).getValue());
		//System.out.println("Third Node:" +((Node) iterator.next()).getValue());
	}
}
