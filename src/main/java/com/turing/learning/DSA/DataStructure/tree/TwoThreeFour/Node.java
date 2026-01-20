package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import java.util.ArrayList;

public class Node {

	public Node current;
	public Node parent;

	public Node getParent() {
		return parent;
	}


	public void setParent(Node parent) {
		this.parent = parent;
	}


	public Integer[] keys = new Integer[3];
	public ArrayList<Node> child = new ArrayList<>();
	
	public static int ORDER = 4;
	public int noOfNode = 1;
	
	
	public Node insertTree(Node current, int item) 
	{
		if ( current.noOfNode != ORDER )
		{
			// valid insert
			return validInsert(current, item);
		}
		else
		{		
			// need to split
			// System.out.println("Current node is full.");
			if ( current.parent == null )
			{
				Node splitReturnParent = split(current);
				
				// find index and insert
				Node nodeToInsert = current.findIndexInsert( splitReturnParent, item );
				current = insertTree(nodeToInsert, item);
				//System.out.println( "Current Parent:" + current.parent.keys[0] );
				return current;
			}
			else
			{
				
			}
			
		}
		return current;
	}


	public Node validInsert(Node current, int item) {
		int index = 0;
		while ( current.keys[index] != null && index != current.keys.length )
		{
			if ( current.keys[index] > item )
			{
				break;
			}
			index++;
		}
		for ( int i = current.keys.length - 1; i > index; i-- )
		{
			current.keys[i] = current.keys[i-1];
		}
		current.keys[index] = item;
		current.noOfNode++;
		return current;
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
		Node parent = new Node();
		parent.keys[0] = current.keys[1];
		
		Node child0 = new Node();
		child0.keys[0] = current.keys[0];
		parent.child.add(child0);
		
		Node child1 = new Node();
		child1.keys[0] = current.keys[2];
		parent.child.add(child1);
		
		return parent;
	}
	
	

}
