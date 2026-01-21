package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import java.util.ArrayList;

public class Node {

	public Node parent;
	
	public Node getParent() 
	{
		return parent;
	}

	public void setParent(Node parent) 
	{
		this.parent = parent;
	}

	public Integer[] keys = new Integer[3];
	public ArrayList<Node> child = new ArrayList<>();
	
	public static int ORDER = 4;
	public int noOfNode = 1;
	
	
	public Node insertTree(Node node, int item) 
	{
		if ( node.noOfNode != ORDER )
		{
			// valid insert
			return validInsert(node, item);
		}
		else
		{		
			// need to split
			// System.out.println("Current node is full.");
			if ( node.parent == null )
			{
				Node splitReturnParent = split(node);
				
				// find index and insert
				Node nodeToInsert = node.findIndexInsert( splitReturnParent, item );
				
				return insertTree( nodeToInsert, item );
			}
			else
			{
				// current node parent is not null;
				System.out.println("Current parent node is not null.");
				Node splitReturnParent = split( node );
				Node currentParent = node.getParent();
				if ( currentParent.noOfNode == 2 )
				{
					// find the current index of the it parent and remove
					int indexToRemove = findCurrentIndexToRemoveFromParent( node, item ); 
					currentParent.child.remove(indexToRemove);
					
					// add split return parent into current parent.
					currentParent.insertTree(currentParent, splitReturnParent.keys[0]);
					
					// re-arrange child currentParent as three tree type
					setThreeTreeType(splitReturnParent, currentParent, indexToRemove);
					
					// find index to insert
					Node nodeToInsert = this.findIndexInsert(currentParent, item);
					
					// insert
					return insertTree( nodeToInsert, item );
				}
			}
			
		}
		return node;
	}

	public void setThreeTreeType(Node splitReturnParent, Node currentParent, int indexToRemove) {
		if ( indexToRemove == 1 )
		{
			Node child1 = new Node();
			child1.setParent(currentParent);
			child1.insertTree(child1, splitReturnParent.keys[0]);
			
			Node child2 = new Node();
			child2.setParent(currentParent);
			child2.insertTree(child2, splitReturnParent.keys[2]);
		}
		else if ( indexToRemove == 0 )
		{
			Node child0 = new Node();
			child0.setParent(currentParent);
			child0.insertTree(child0, splitReturnParent.keys[0]);
			
			Node child1 = new Node();
			child1.setParent(currentParent);
			child1.insertTree(child1, splitReturnParent.keys[2]);
			
			Node child2 = new Node();
			child2.setParent(currentParent);
			child2.insertTree(child0, splitReturnParent.keys[1]);
		}
	}

	public int findCurrentIndexToRemoveFromParent(Node node, int item) {
		Node currentParent = node.getParent();
		int index = 0;
		while ( currentParent.keys[index] != null && index != currentParent.keys.length )
		{
			if ( currentParent.keys[index] > item )
			{
				break;
			}
			index++;
		}
		return index;
	}


	public Node validInsert(Node node, int item) {
		int index = 0;
		while ( node.keys[index] != null && index != node.keys.length )
		{
			if ( node.keys[index] > item )
			{
				break;
			}
			index++;
		}
		for ( int i = node.keys.length - 1; i > index; i-- )
		{
			node.keys[i] = node.keys[i-1];
		}
		node.keys[index] = item;
		node.noOfNode++;
		return node;
	}


	private Node findIndexInsert(Node splitReturnParent, int item) 
	{
		Node currentParent = splitReturnParent;
		int index = 0;
		while ( currentParent.child != null )
		{	
			index = 0;
			while ( currentParent.keys[index] != null && index != currentParent.keys.length )
			{
				if ( currentParent.keys[index] > item )
				{
					break;
				}
				index++;
			}
			
			if ( currentParent.child.size() == 0 )
			{
				break;
			}
			else
			{
				currentParent = currentParent.child.get(index);
			}
		}
		
		System.out.println( "Index :" + index );
		System.out.println( "Current Index 0 Value :" + currentParent.keys[0] );
		System.out.println( "Current Index 1 Value :" + currentParent.keys[1] );
		// insert
		return currentParent;
	}


	public Node split(Node current) {
		Node currentParent = new Node();
		currentParent.insertTree(currentParent, current.keys[1]);
		
		Node child0 = new Node();
		child0.insertTree(child0,current.keys[0]);
		child0.setParent(currentParent);
		currentParent.child.add(child0);
		
		Node child1 = new Node();
		child1.insertTree(child1, current.keys[2]);
		child1.setParent(currentParent);
		currentParent.child.add(child1);
		
		return currentParent;
	}
	
	

}
