package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

public class TwoThreeFourTree {

	Node current;
	public Node insert(int item) 
	{
		if ( current == null )
		{
			current = new Node();
			current.keys[0] = item;
			current.noOfNode++;
		}
		else
		{
			return current.insertTree( current, item );  
		}
		return current;
	}

}
