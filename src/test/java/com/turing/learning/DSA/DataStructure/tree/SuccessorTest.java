package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class SuccessorTest {
	
	BinaryTree tree = new BinaryTree();

	@Test 
	public void testSuccessorNullCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		
		Node deleteNode = tree.delete(15);
		
		assertNull( tree.getSuccessor(deleteNode) );
		
	}
	
	@Test 
	public void testSuccessorLeftChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		
		Node deleteNode = tree.delete(15);
		
		assertEquals( 13, tree.getSuccessor(deleteNode).getValue() );
		
	}
	
	@Test 
	public void testSuccessorRightChildCase()
	{
		tree.insert(20);
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		tree.insert(17);
		tree.insert(19);
		tree.insert(16);
		tree.insert(18);
		
		/*
		 *       20 
		     15      30
		 13     17
		      16   19
		         18
		 * */		
		Node deleteNode = tree.delete(17);
		
		assertEquals( 18, tree.getSuccessor(deleteNode).getValue() );
		
	}
}
