package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BinaryTreeWithArrayDeleteTest {
	
	BinaryTreeWithArray tree = new BinaryTreeWithArray();

	
	//@Test
	public void deleteEmptyCase()
	{
		Integer item = tree.delete(17);
		
		assertNull(item);
	}
	
	//@Test
	public void deleteRootCase()
	{
		tree.insert(17);
		
		Integer item = tree.delete(17);
		assertEquals( 17, item );
		
		int index = tree.search(17);
		assertEquals( -1, index );
		
		Util util = new Util(tree);
		assertFalse( util.isBinaryTree());
		
	}
	
	//@Test
	public void deleteLeftChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		
		Integer item = tree.delete(15);
		assertEquals( 15, item );
		
		int index = tree.search(15);
		assertEquals( -1, index );
		
		Util util = new Util(tree);
		assertTrue( util.isBinaryTree());
	}
	
	@Test
	public void deleteLeftChildHasOnlyLeftChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(13);
		tree.insert(10);
		tree.insert(16);
		
		Integer item = tree.delete(15);
		assertEquals( 15, item );
		
		int index = tree.search(15);
		assertEquals( -1, index );
		
		Util util = new Util(tree);
		assertTrue( util.isBinaryTree());
	}
	
	//@Test
	public void deleteRightChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		
		Integer item = tree.delete(30);
		assertEquals( 30, item );
		
		int index = tree.search(30);
		assertEquals( -1, index );
		
		Util util = new Util(tree);
		assertTrue( util.isBinaryTree());
	}
	
	//@Test
	public void deleteRightChildHasOnlyRightChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		tree.insert(35);
		
		Integer item = tree.delete(30);
		assertEquals( 30, item );
		
		int index = tree.search(30);
		assertEquals( -1, index );
		
		Util util = new Util(tree);
		assertTrue( util.isBinaryTree());
	}
	
	//@Test
	public void deleteRightChildHasBothCase()
	{
		tree.insert(17);
		tree.insert(30);
		tree.insert(35);
		tree.insert(18);
		
		Integer item = tree.delete(30);
		assertEquals( 30, item );
		
		int index = tree.search(30);
		assertEquals( -1, index );
		
		Util util = new Util(tree);
		assertTrue( util.isBinaryTree());
	}

}
