package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinaryTreeWithArrayTest {
	
	BinaryTreeWithArray binaryTree = new BinaryTreeWithArray();
	@Test
	public void insertRootCase()
	{
		int index = binaryTree.insert(17);
		
		assertEquals( 0, index );

	}
	
	@Test
	public void insertLeftChildCase()
	{
		binaryTree.insert(17);
		int index = binaryTree.insert(15);
		
		assertEquals( 1, index );
	}
	
	@Test
	public void insertRightChildCase()
	{
		binaryTree.insert(17);
		binaryTree.insert(15);
		int index = binaryTree.insert(30);
		
		assertEquals( 2, index );
	}
	
	@Test
	public void insertLeftChildLeftCase()
	{
		binaryTree.insert(17);
		binaryTree.insert(15);
		binaryTree.insert(30);
		int index = binaryTree.insert(13);
		
		assertEquals( 3, index );
	}

}
