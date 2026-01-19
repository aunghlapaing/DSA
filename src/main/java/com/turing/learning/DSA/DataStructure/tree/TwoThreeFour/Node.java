package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import java.util.ArrayList;
import java.util.Arrays;

public class Node {

	public Integer[] keys = new Integer[3];

	ArrayList<Node> child = new ArrayList<>();
	public static int order = 4; // to compare with noOfNode to know tree type;
	int noOfNode = 1; // will increase into 2-3 later
	
	Node parent;
	public Node getParent() 
	{
		return parent;
	}

	public void setParent(Node parent) 
	{
		this.parent = parent;
	}

	public Node insertTree(Node current, int item) {
		if ( current.noOfNode != order )
		{
			return insertTwoThreeFourValid(current, item);
		}
		else
		{
			// split
			System.out.println( "Tree is 4 tree." );
			if ( parent == null )
			{
				Node currentParent =  splitWithoutParent(current);
				parent = currentParent;
				
				Node insertNode = findIndexToInsertNode(item, parent);
				
				System.out.println( "InsertNode index 0:" + insertNode.keys[0] );
				System.out.println( "InsertNode index 1:" + insertNode.keys[1] );
				System.out.println( "InsertNode index 2:" + insertNode.keys[2] );
				
				return insertNode.insertTree(insertNode,item);
				
			}
			else
			{
				System.out.println( "Child is full." );
				Node currentParent = splitWithParent(current);
				parent = currentParent;
				
				Node insertNode = findIndexToInsertNode(item, parent);
				return insertNode.insertTree(insertNode, item);
			}	
		}
	}

	// split with parent
	public Node splitWithParent(Node current) 
	{
		
		Node addParent = current.parent;
		
		// get the current node split parent
		Node currentParent = this.splitWithoutParent( current );
		
		System.out.println( "Current : " + current.keys[0] );
		System.out.println( "Current : " + current.keys[1] );
		System.out.println( "Current : " + current.keys[2] );
		
		System.out.println( "CurrentParent Child0 : " + currentParent.keys[0] );
		System.out.println( "CurrentParent Child1 : " + currentParent.keys[2] );
		
		// current node's parent is valid order
		if ( current.parent.noOfNode != order )
		{
			addParent.insertTree(addParent, currentParent.keys[0]);
		}
		
		// current node's parent is full and need to split
		else
		{
			
		}
		
		// parent is Three Tree Node
		if ( addParent.noOfNode == 3 )
		{
			if ( current == addParent.child.get(0) )
			{
				// current node is child0
			}
			else
			{
				// current node is child1
				
				// remove current from addParent's child
				addParent.child.remove(current);
				
				// re-arrange addParent's child
				Node child0 = new Node();
				child0 = addParent.child.get(0);
				child0.setParent(addParent);
				
				Node child1 = new Node();
				child1.insertTree(addParent, currentParent.keys[0]);
				child1.setParent(addParent);
				
				Node child2 = new Node();
				child2.insertTree(addParent, currentParent.keys[2]);
				child2.setParent(addParent);
				
				addParent.child.add(child0);
				addParent.child.add(child1);
				addParent.child.add(child2);
				
				parent = addParent;
				return parent;
			}
		}
		
		// parent is Four Tree Node
		if ( addParent.noOfNode == 4 )
		{
			
		}
		
		
		return parent;
	}

	// split without parent
	public Node splitWithoutParent( Node current )
	{
		Node currentParent = new Node();
		currentParent.insertTree(currentParent, current.keys[1]);
		
		Node child0 = new Node();
		child0.insertTree(child0, current.keys[0]);
		child0.setParent(currentParent);
		
		Node child1 = new Node();
		child1.insertTree(child1, current.keys[2]);
		child1.setParent(currentParent);
		
		currentParent.child.add(child0);
		currentParent.child.add(child1);
		
		return currentParent;
	}
	
	// find index to insert node
	public Node findIndexToInsertNode(int item, Node parent) 
	{
		int index = 0;
		while ( parent.keys[index] != null && index != parent.keys.length )
		{
			if ( parent.keys[index] > item )
			{
				break;
			}
			index++;
		}
		// get the index number to insert item
		
		Node insertNode = parent.child.get(index);
		return insertNode;
	}

	// insert when the current node is valid ( noOfNode != oder )
	public Node insertTwoThreeFourValid(Node current, int item) 
	{
		// current node
		int index = 0;
		//System.out.println("index 0 value: " + keys[0]);
		while ( current.keys[index] != null && index !=  current.keys.length )
		{
			if (  current.keys[index] > item )
			{
				break;
			}
			index++;
		}
		
		System.out.println("index : " + index + "  " + "Item :" + item);
		
		for ( int i =  current.keys.length - 1 ; i > index; i-- )
		{
			 current.keys[i] =  current.keys[i-1];
		}
	    current.keys[index] = item;	
		current.noOfNode++;
		return current;
	}
	

}
