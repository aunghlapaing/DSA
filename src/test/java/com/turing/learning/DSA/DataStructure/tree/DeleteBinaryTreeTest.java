package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

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
	public void deleteNodeRootCase()
	{
		tree.insert(17);
		
		tree.delete(17);
		
		//assertEquals( null, tree.root );
		
		BinaryTreeUtil util = new BinaryTreeUtil();
		
		assertFalse(util.isBinaryTree(tree));
	}
	
	@Test
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
	
	

}
