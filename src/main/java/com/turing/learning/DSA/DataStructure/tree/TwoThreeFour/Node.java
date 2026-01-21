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
				Node splitReturnParent = split(node);
				
				Node currentParent = node.getParent();
				
				if ( currentParent.noOfNode == 2 )
				{
					// find the current index of the it parent and remove
					int indexToRemove = findCurrentIndexToRemoveFromParent( node, item ); 
					currentParent.child.remove(indexToRemove);
					
					System.out.println("Index to remove :" + indexToRemove);
					
					// add split return parent into current parent.
					currentParent.insertTree(currentParent, splitReturnParent.keys[0]);
					
					System.out.println("Current Parent after split parent insert :" + currentParent.noOfNode);
					
					// re-arrange child currentParent as three tree type
					setThreeTreeType(splitReturnParent, currentParent, indexToRemove);
					
					// find index to insert
					Node nodeToInsert = this.findIndexInsert(currentParent, item);
					
					// insert
					return insertTree( nodeToInsert, item );
				}
				else if ( currentParent.noOfNode == 3 )
				{
					System.out.println("Current Parent is three tree.");
					
					System.out.println("Split return parent value: " + splitReturnParent.keys[0]);
					
					// find the current index of the it parent and remove
					int indexToRemove = findCurrentIndexToRemoveFromParent( node, item ); 
					currentParent.child.remove(indexToRemove);
					
					System.out.println("Index to remove :" + indexToRemove);
					
					// add split return parent into current parent.
					currentParent.insertTree(currentParent, splitReturnParent.keys[0]);
					
					System.out.println("Current Parent after split parent insert :" + currentParent.noOfNode);
					
					// re-arrange child currentParent as four tree type
					setFourTreeType( splitReturnParent, currentParent, indexToRemove );
					
					//Node child3 = currentParent.child.get(3);
					//System.out.println( "Current Parent child 3 : " + child3.keys[0]);
					
					//System.out.println( "Current Parent's index 2 value : " + currentParent.keys[2]);
					
					// find index to insert item
					Node nodeToInsert = this.findIndexInsert(currentParent, item);
					
					System.out.println( "Insert Node index 0 value : " + nodeToInsert.keys[0]);
					// insert
					return insertTree( nodeToInsert, item );
				}
			}
			
		}
		return node;
	}

	public void setFourTreeType(Node splitReturnParent, Node currentParent, int indexToRemove) 
	{
		if ( indexToRemove == 2 )
		{
			Node child2 = splitReturnParent.child.get(0);
			child2.setParent(currentParent);
			currentParent.child.add(child2);
			
			Node child3 = splitReturnParent.child.get(1);
			child3.setParent(currentParent);
			currentParent.child.add(child3);
		}
	}

	public void setThreeTreeType(Node splitReturnParent, Node currentParent, int indexToRemove) 
	{	
		if ( indexToRemove == 1 )
		{
			Node child1 = splitReturnParent.child.get(0);
			child1.setParent(currentParent);
			currentParent.child.add(child1);
			
			Node child2 = splitReturnParent.child.get(1);
			child2.setParent(currentParent);
			currentParent.child.add(child2);
		}
		else if ( indexToRemove == 0 )
		{
			Node child0 = splitReturnParent.child.get(0);
			child0.setParent(currentParent);
			currentParent.child.add(child0);
			
			Node child1 = splitReturnParent.child.get(1);
			child1.setParent(currentParent);
			currentParent.child.add(child1);
			
			// change child 0 and and currentParnet child 1
			for ( int i =0; i < currentParent.child.size()-1; i++ )
			{
				Node temp = currentParent.child.get(i);
				currentParent.child.set(i, currentParent.child.get(i+1));
				currentParent.child.set(i+1, temp);
			}
			
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
		while ( index != node.keys.length && node.keys[index] != null   )
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


	public Node findIndexInsert(Node currentParent, int item) 
	{
		int index = 0;
		while ( currentParent.child != null )
		{	
			index = 0;
			while ( index != currentParent.keys.length && currentParent.keys[index] != null )
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
		System.out.println(" child 1 value : " + child1.keys[0] );
		child1.setParent(currentParent);
		currentParent.child.add(child1);
		
		return currentParent;
	}
}
