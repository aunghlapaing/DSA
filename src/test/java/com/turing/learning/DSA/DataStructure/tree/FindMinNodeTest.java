package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FindMinNodeTest {
	
	@Test
	public void findMinNodeSimpleCase()
	{
		Node root = new Node(17);
		BinaryTree tree = new BinaryTree(root);
		
		Node minNode = tree.findMinNode();
		
		assertEquals( 17, minNode.getValue() );
	}
	
	@Test
	public void findMinNodeManyCase()
	{
		Node root = new Node(17);
		BinaryTree tree = new BinaryTree(root);
		
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		
		Node minNode = tree.findMinNode();
		
		assertEquals( 13, minNode.getValue() );
	}

}
