package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class PreOrderTraversalTest {
	
	BinaryTreeWithArray tree;
	public PreOrderTraversalTest()
	{
		tree = new BinaryTreeWithArray();
		tree.insert(17);
		tree.insert(15);
		tree.insert(13);
		tree.insert(30);
		tree.insert(35);
		tree.insert(18);
		tree.insert(16);
	}
	
	@Test
	public void preOrderTraversalCase()
	{
		BinaryTreeTraversal preOrder = new PreOrderTraversal(tree);
		Iterator<Integer> iterator = preOrder.iterator();
		
		assertEquals( 17, iterator.next() );
		assertEquals( 15, iterator.next() );
		assertEquals( 13, iterator.next() );
		assertEquals( 16, iterator.next() );
		assertEquals( 30, iterator.next() );
		assertEquals( 18, iterator.next() );
		assertEquals( 35, iterator.next() );
		
		assertFalse(iterator.hasNext());
	}

}
