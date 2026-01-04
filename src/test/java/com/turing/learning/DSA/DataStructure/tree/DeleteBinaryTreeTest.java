package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class DeleteBinaryTreeTest {
	
	@Test
	public void deleteNodeLeafCase()
	{
		BinaryTree tree = new BinaryTree();
		
		tree.insert(17);
		assertEquals( 17, tree.root.getValue() );
		
		
//		tree.deleteNode(17);
//
//		BinaryTreeTraversal inOrder = new InOrderTraversalWithIterative(tree);
//		Iterator<Node> iterator = inOrder.iterator();
//
//		assertEquals( null, iterator.next() );
	}

}
