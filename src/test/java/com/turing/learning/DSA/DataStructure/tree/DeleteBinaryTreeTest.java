package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DeleteBinaryTreeTest {
	
	BinaryTree tree = new BinaryTree();
	
	@Test
	public void isBinaryTreeTest()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		
		BinaryTreeUtil util = new BinaryTreeUtil();

		assertTrue( util.isBinaryTree(tree) );
	}
	
	@Test
	public void deleteRootCase()
	{
		tree.insert(17);
		
		tree.delete(17);
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertFalse(util.isBinaryTree(tree));
	}
	
	//@Test
	public void deleteRigtChildSimpleCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		
		tree.delete(30);
		
		assertNull(tree.search(30));
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertTrue(util.isBinaryTree(tree));
	}
	
	@Test
	public void deleteLeftChildSimpleCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		
		tree.delete(15);
		
		assertNull(tree.search(15));
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertTrue(util.isBinaryTree(tree));
	}
	
	@Test
	public void deleteSubTreeHasLeftChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		
		tree.delete(15);
		
		assertNull(tree.search(15));
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertTrue(util.isBinaryTree(tree));
	}
	
	@Test
	public void deleteSubTreeHasRightChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		tree.insert(16);
		
		tree.delete(15);
		
		assertNull(tree.search(15));
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertTrue(util.isBinaryTree(tree));
	}
	
	@Test
	public void deleteSubTreeHasRightChildHasLeftChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		tree.insert(16);
		tree.insert(35);
		tree.insert(18);
		tree.insert(31);
		
		tree.delete(30);
		
		assertNull(tree.search(30));
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertTrue(util.isBinaryTree(tree));
	}
	
	@Test
	public void deleteRootWithLeftChildsCase()
	{
		tree.insert(17);
		tree.insert(10);
		tree.insert(16);
		tree.insert(14);
		tree.insert(15);
		
		tree.delete(17);
		
		assertNull(tree.search(17));
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertTrue(util.isBinaryTree(tree));
	}
	
	@Test
	public void deleteRootWithRightChildsCase()
	{
		tree.insert(17);
		tree.insert(30);
		tree.insert(18);
		tree.insert(19);
		
		tree.delete(17);
		
		assertNull(tree.search(17));
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertTrue(util.isBinaryTree(tree));
	}
	
	
}
