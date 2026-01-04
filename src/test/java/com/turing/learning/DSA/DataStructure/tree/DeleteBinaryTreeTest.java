package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.Test;

public class DeleteBinaryTreeTest {
	
	BinaryTree tree = new BinaryTree();
	
	@Test
	public void deleteNodeLeafCase()
	{
		tree.insert(17);
		
		tree.delete(17);
		
		//assertEquals( null, tree.root );
		
		BinaryTreeTraversal inOrder = new InOrderTraversalWithIterative(tree);
		Iterator<Node> iterator = inOrder.iterator();
		
		RuntimeException except = assertThrows( RuntimeException.class, ()-> {
			iterator.next();
		} );
		
		assertTrue(except.getMessage().contains("Index out of Bound."));
	}
	
	@Test
	public void deleteRigtChildSimpleCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		
		tree.delete(30);
		
		BinaryTreeTraversal inOrder = new InOrderTraversalWithIterative(tree);
		Iterator<Node> iterator = inOrder.iterator();
		
		// InOrder ( lRr )
		// [ 15, 17 ]
		
		assertEquals( 15, iterator.next().getValue() ); 
		assertEquals( 15, iterator.next().getValue() ); 
		assertFalse( iterator.hasNext()); 
	}

}
