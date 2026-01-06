package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTreeUtil {
	
	public boolean isBinaryTree(BinaryTree tree)
	{
		BinaryTreeTraversal inOrder = new InOrderTraversalWithIterative(tree);
		Iterator<Node> iterator = inOrder.iterator();
		
		ArrayList<Node> list = new ArrayList<>();

		if ( iterator.hasNext() )
		{
			while ( iterator.hasNext() )
			{
				list.add(iterator.next());
			}
			//System.out.println( "List Size :" + list.size() );
			
			for ( int i = 1; i < list.size(); i++ )
			{
				Node first = list.get(i-1);
				Node next = list.get(i);

				if ( first.getValue() < next.getValue() )
				{
					return true;
				}
			}
			return false;
		}
		else
		{
			return false;
		}
		
	}

}
