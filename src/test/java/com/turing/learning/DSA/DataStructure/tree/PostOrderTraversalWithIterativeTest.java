package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class PostOrderTraversalWithIterativeTest {
	
	BinaryTree tree;
	public PostOrderTraversalWithIterativeTest()
	{
		Node root = new Node(17);
		this.tree = new BinaryTree(root);
	}
	
	//@Test
	public void postOrderTraversalLeftChildCase()
	{
		
		tree.insert(15);
		tree.insert(16);
		tree.insert(13);
		
		BinaryTreeTraversal postOrder = new PostOrderTraversalWithIterative(tree);
		
		Iterator<Node> iterator = postOrder.iterator();
		
		assertEquals( 13, iterator.next().getValue() );
		assertEquals( 16, iterator.next().getValue() );
		assertEquals( 15, iterator.next().getValue() );
		assertEquals( 17, iterator.next().getValue() );

	}
	
	
	//@Test
	public void postOrderTraversalRightChildCase()
	{
		
		tree.insert(30);
		tree.insert(35);
		tree.insert(18);
		
		BinaryTreeTraversal postOrder = new PostOrderTraversalWithIterative(tree);
		
		Iterator<Node> iterator = postOrder.iterator();
		
		assertEquals( 18, iterator.next().getValue() );
		assertEquals( 35, iterator.next().getValue() );
		assertEquals( 30, iterator.next().getValue() );
		assertEquals( 17, iterator.next().getValue() );
		
	}
	
	@Test
	public void postOrderTraversaLeftChildAndRightChildCase()
	{
		
//		tree.insert(15);
//		tree.insert(30);
//		tree.insert(13);
//		tree.insert(16);
//		tree.insert(18);
//		tree.insert(35);
//		tree.insert(19);
//		
		tree.insert(15);
		tree.insert(13);
		tree.insert(16);
		tree.insert(30);
		tree.insert(18);
		tree.insert(35);
		tree.insert(19);
		
		BinaryTreeTraversal postOrder = new PostOrderTraversalWithIterative(tree);
		
		Iterator<Node> iterator = postOrder.iterator();
		
		assertEquals( 13, iterator.next().getValue() );
		assertEquals( 16, iterator.next().getValue() );
		assertEquals( 15, iterator.next().getValue() );
		assertEquals( 19, iterator.next().getValue() );
		assertEquals( 18, iterator.next().getValue() );
		assertEquals( 35, iterator.next().getValue() );
		assertEquals( 30, iterator.next().getValue() );
		assertEquals( 17, iterator.next().getValue() );
		
	}
	
}
