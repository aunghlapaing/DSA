package com.turing.learning.DSA.DataStructure.tree.array;

import org.junit.jupiter.api.Test;

public class PreOrderTraversalTest {
	
	BinaryTreeWithArray tree;
	public PreOrderTraversalTest()
	{
		tree = new BinaryTreeWithArray();
		tree.insert(17);
		tree.insert(15);
		tree.insert(13);
		tree.insert(30);
		tree.insert(35);
		tree.insert(18);
		tree.insert(16);
	}
	
	@Test
	public void preOrderTraversalCase()
	{
		BinaryTreeTraversal preOrder = new PreOrderTraversal(tree);
	}

}
