package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

public class TwoThreeFourTree {

	Node current ;
	
	public Node insert(int item) 
	{
		if ( current == null )
		{
			return insertEmptyTree(item);
		}
		else
		{
			current = current.insertTree(current, item);
			return current;
		}
		
	}

	public Node insertEmptyTree(int item) 
	{
		current = new Node();
		current.keys[0] = item;
		current.noOfNode++;
		return current;
	}

}
