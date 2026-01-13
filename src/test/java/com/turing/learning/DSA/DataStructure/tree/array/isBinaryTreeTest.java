package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class isBinaryTreeTest {
	
	BinaryTreeWithArray tree = new BinaryTreeWithArray();
	
	//@Test
	public void isBinaryTreeCase()
	{
		Util util = new Util(tree);
		
		Integer[] items = {13, 15, 16, 17, 18, 30, 35};
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(items));

		assertEquals( array, util.isBinaryTree());
		
	}
	
	@Test
	public void isBSTSortedArrayCase()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		tree.insert(16);
		tree.insert(18);
		tree.insert(35);
		tree.insert(2);
		
		Util util = new Util(tree);
		assertTrue( util.isBinaryTree() );
	}
	
	@Test
	public void isBSTSortedArrayEmptyCase()
	{
		Util util = new Util(tree);
		assertFalse( util.isBinaryTree() );
	}
	
}
