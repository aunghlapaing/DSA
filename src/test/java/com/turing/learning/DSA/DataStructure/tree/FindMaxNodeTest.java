package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FindMaxNodeTest {
	
	@Test
	public void findmaxNodeSimpleCase()
	{
		Node root = new Node(17);
		BinaryTree tree = new BinaryTree(root);
		
		Node maxNode = tree.findMaxNode();
		
		assertEquals( 17, maxNode.getValue() );
	}
	
	//@Test
	public void findMaxNodeManyCase()
	{
		Node root = new Node(17);
		BinaryTree tree = new BinaryTree(root);
		
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		tree.insert(35);
		
		Node maxNode = tree.findMaxNode();
		
		assertEquals( 35, maxNode.getValue() );
	}

}
