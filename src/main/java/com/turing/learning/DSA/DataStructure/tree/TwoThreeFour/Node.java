package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import java.util.ArrayList;
import java.util.Arrays;

public class Node {
	
	Node parent;
	public Integer[] keys = new Integer[3];

	ArrayList<Node> child = new ArrayList<>();
	
	int order = 4; // to compare with noOfNode to know tree type;
	int noOfNode = 1; // will increase into 2-3 later
	
	
	public Node insertTree(Node current, int item) {
		if ( current.noOfNode != current.order )
		{
			return insertTwoThreeFourValid(current, item);
		}
		else
		{
			// split
			System.out.println( "Tree is 4 tree." );
			if ( parent == null )
			{
				Node parent =  splitWithoutParent(current);
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
				
				System.out.println( "InsertNode index 0:" + insertNode.keys[0] );
				System.out.println( "InsertNode index 1:" + insertNode.keys[1] );
				System.out.println( "InsertNode index 2:" + insertNode.keys[2] );
				
				return insertNode.insertTree(insertNode,item);
				
			}
			else
			{
//				Node parent = splitWithParent(node);
				return null;
			}	
		}
	}


//	private Node splitWithParent(Node node) 
//	{
//		
//		return null;
//	}

	public Node splitWithoutParent( Node node) 
	{
		Node parent = new Node();
		parent.insertTree(parent, node.keys[1]);
		
		Node child0 = new Node();
		child0.insertTree(child0,node.keys[0]);
		child0.parent = parent;
		
		Node child1 = new Node();
		child1.insertTree(child1,node.keys[2]);
		child1.parent = parent;
		
		parent.child.add(child0);
		parent.child.add(child1);
		
		return parent;
	}

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
