package com.turing.learning.DSA.LinkedList;

public class Node extends LinkedList {
	
	int value;
	public Node next;
	
	Node(int item)
	{
		this.value = item;
	}

	public void setNext(Node node) 
	{
		this.next = node;
	}
	
	public int getValue()
	{
		return this.value;
	}

	public Node getNext() 
	{
		return this.next;
	}

}
