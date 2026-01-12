package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class BinaryTreeWithArraySearchTest {
	
	BinaryTreeWithArray binaryTree = new BinaryTreeWithArray();
	
	@Test
	public void searchTreeEmptyCase()
	{
		
		int index = binaryTree.search(17);
	
		
		assertEquals(-1, index);
	}
	
	@Test
	public void searchRootCase()
	{
		binaryTree.insert(17);
		
		int index = binaryTree.search(17);
		
		assertEquals( 0, index );
	}
	
	@Test
	public void searchNaNCase()
	{
		binaryTree.insert(17);
		binaryTree.insert(15);
		binaryTree.insert(30);
		
		/*
		 * 		  17
		 *       /  \
		 *     15    30 
		 * 
		 * */
		
		int index = binaryTree.search(19);
		
		assertEquals( -1, index );
	}
	
	@Test
	public void searchCompletedCase()
	{
		binaryTree.insert(17);
		binaryTree.insert(15);
		binaryTree.insert(30);
		binaryTree.insert(16);
		binaryTree.insert(35);
		binaryTree.insert(18);
		
		/*
		 * 		     17
		 *        /      \
		 *      15        30 
		 *     /  \      /  \
		 *        16    18   35
		 * 
		 * */
		
		int index = binaryTree.search(35);
		
		assertEquals( 6, index );
	}

}
