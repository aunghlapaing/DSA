package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

public class TwoThreeFourTree {
	
	Node root;
	
	public Node insert(int item) 
	{
		// tree is empty
		if ( this.root == null )
		{
			root = new Node();
			root.key[0] = item;
			root.noOfkey++;	
		}
		return root;
	}

}
