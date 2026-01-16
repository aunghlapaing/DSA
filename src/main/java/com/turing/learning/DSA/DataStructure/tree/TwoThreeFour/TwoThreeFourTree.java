package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

public class TwoThreeFourTree {

	Node current ;
	
	public Node insert(int item) 
	{
		// empty tree
		if ( current == null )
		{
			current = new Node();
			current.keys[0] = item;
			current.noOfNode++;
			
		}
		else
		{
			if ( current.noOfNode != current.order )
			{
				int index = 0;
				
				//System.out.println( "Current Index Value :" +  current.keys[index]);
				
				while ( current.keys[index] != null && index != current.keys.length )
				{
					if ( current.keys[index] > item )
					{
						break;
					}
					index++;
				}
				
				//System.out.println( "Current Index  :" + index );
				
				for ( int i = current.keys.length - 1 ; i > index; i-- )
				{
					current.keys[i] = current.keys[i-1];
				}
				current.keys[index] = item;	
				current.noOfNode++;
			}
			else
			{
				// split current node into 2 tree
				System.out.println( "Current node is 4 tree.");
			}
		}
		return current;
	}

}
