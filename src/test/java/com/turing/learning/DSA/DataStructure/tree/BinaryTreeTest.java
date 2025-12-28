package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {
	
	public BinaryTree CreateTreeNode() {
		Node root = new Node(10);
		Node left = new Node(5);
		Node right = new Node(15);
		
		root.setLeftChild(left);
		root.setRightChild(right);
		
		BinaryTree tree = new BinaryTree(root);
		return tree;
	}
	
	@Test
	public void binaryTreeSearchCase()
	{
		BinaryTree tree = CreateTreeNode();
		assertEquals( 10, tree.search(10).getValue());	/* root */
		assertEquals( 5, tree.search(5).getValue());  /* leftChild */
		assertEquals( 15, tree.search(15).getValue());	/* rightChild */
		
	}

}
