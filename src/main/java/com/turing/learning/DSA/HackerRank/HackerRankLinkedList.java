package com.turing.learning.DSA.HackerRank;

public class HackerRankLinkedList {

	Node firstNode;
	Node lastNode;

	public void add(int item) {
		
		Node node = new Node(item);
		// first node
		if( firstNode == null && lastNode == null )
		{
			firstNode = node;
			lastNode = node;
		}
		else
		{
			lastNode.next = node;
			lastNode = node;
		}
		
	}

	public Node removeDuplicateItem(Node head) 
	{
		Node currentNode = head;
		
		while ( currentNode != null && currentNode.next != null )
		{
			if( currentNode.data == currentNode.next.data )
			{
				currentNode.next = currentNode.next.next;
			}
			else
			{
				currentNode = currentNode.next;
			}
		}
		return head;
	}

}
