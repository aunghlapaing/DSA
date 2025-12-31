package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class InOrderTraversalTest {
	
	BinaryTree tree;
	public InOrderTraversalTest()
	{
		Node root = new Node(17);
		tree = new BinaryTree(root);
		
		tree.insert(15);
		tree.insert(13);
		tree.insert(16);
		tree.insert(30);
		tree.insert(18);
		tree.insert(35);
		tree.insert(19);
	}
	
	@Test
	public void InOrderTraversalCase()
	{
		BinaryTreeTraversal inOrder = new InOrderTraversal(tree);
		
		Iterator<Node> iterator = inOrder.iterator();
		
		assertEquals( 13, iterator.next().getValue() );
		assertEquals( 15, iterator.next().getValue() );
		assertEquals( 16, iterator.next().getValue() );
		assertEquals( 17, iterator.next().getValue() );
		assertEquals( 18, iterator.next().getValue() );
		assertEquals( 19, iterator.next().getValue() );
		assertEquals( 30, iterator.next().getValue() );
		assertEquals( 35, iterator.next().getValue() );
	}

}
