package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinaryTreeInsertTest {

	BinaryTree tree = new BinaryTree();
	Node root = tree.insert(17);
	
	@Test
	public void insertRootCase()
	{
		Node left = tree.insert(15);
		
		assertEquals( 15, root.getLeftChild().getValue()); 
		assertEquals( 17, left.getParent().getValue() );
	}
	
	@Test
	public void insertRootRigthCase()
	{	
		tree.insert(30);
		
		assertEquals( 30, root.getRightChild().getValue()); 
	}
	
	@Test
	public void insertRootLeftChildLeftCase()
	{	
		Node left = tree.insert(15);
		tree.insert(13);
		
		assertEquals( 13, left.getLeftChild().getValue()); 
	}
	
	@Test
	public void insertRootLeftChildRightCase()
	{	
		Node left = tree.insert(15);
		tree.insert(16);
		
		assertEquals( 16, left.getRightChild().getValue()); 
	}
	
	@Test
	public void insertRootRightChildLeftCase()
	{	
		Node right = tree.insert(30);
		tree.insert(18);
		
		assertEquals( 18, right.getLeftChild().getValue()); 
	}
	
	@Test
	public void insertRootRightChildRightCase()
	{	
		Node right = tree.insert(30);
		tree.insert(35);
		
		assertEquals( 35, right.getRightChild().getValue()); 
	}
}
