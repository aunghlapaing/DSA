package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoThreeFourSplitTest {
	
	TwoThreeFourTree tree = new TwoThreeFourTree();
	
	@Test
	public void splitSimpleCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		Node node = tree.insert(25);
		
		Node parent = new Node();
		parent = node.parent;

		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
	
		assertEquals( 15, parent.keys[0] );
		assertEquals( 10, child0.keys[0] );
		assertEquals( 20, child1.keys[0] );
		assertEquals( 25, child1.keys[1] );
		assertEquals( 3, node.noOfNode );
	}

}
