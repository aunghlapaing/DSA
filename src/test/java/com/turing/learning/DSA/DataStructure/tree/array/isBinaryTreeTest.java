package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class isBinaryTreeTest {
	
	BinaryTreeWithArray tree = new BinaryTreeWithArray();
	public isBinaryTreeTest()
	{
		tree.insert(17);
		tree.insert(15);
		tree.insert(30);
		tree.insert(13);
		tree.insert(16);
		tree.insert(18);
		tree.insert(35);
		
	}
	
	@Test
	public void isBinaryTreeCase()
	{
		Util util = new Util(tree);
		
		Integer[] items = {13, 15, 16, 17, 18, 30, 35};
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(items));

		assertEquals( array, util.isBinaryTree());
	}
	
}
