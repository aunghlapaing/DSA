package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinaryTreeWithArrayTest {
	
	
	@Test
	public void insertRootCase()
	{
		BinaryTreeWithArray binaryTree = new BinaryTreeWithArray();
		Integer tree = binaryTree.insert(17);
		
		assertEquals( 17, tree );
		
		
	}

}
