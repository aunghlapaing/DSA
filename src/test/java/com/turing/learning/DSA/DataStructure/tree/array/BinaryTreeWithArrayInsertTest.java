package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinaryTreeWithArrayInsertTest {
	
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
		int index = binaryTree.insert(13);
		
		assertEquals( 3, index );
	}
	
	@Test
	public void insertRigthChildLeftCase()
	{
		binaryTree.insert(17);
		binaryTree.insert(30);
		int index = binaryTree.insert(18);
		
		/*
		 *       17 
		 *         \
		 *          30
		 *          /
		 *        18
		 * */
		
		assertEquals(5, index );
	}
	
	@Test
	public void insertLeftCase()
	{
		binaryTree.insert(17);
		binaryTree.insert(30);
		binaryTree.insert(18);
		int index = binaryTree.insert(15);
		
		/*
		 *       17 
		 *         \
		 *          30
		 *          /
		 *        18
		 * */
		
		assertEquals(1, index );
	}

}
