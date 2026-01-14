package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoThreeFourInsertTest {
	
	@Test
	public void insertRootNodeCase()
	{
		TwoThreeFourTree tree = new TwoThreeFourTree();
		
		Node node = tree.insert(15);
		
		assertEquals( 15, node.key[0] );
	}

}
