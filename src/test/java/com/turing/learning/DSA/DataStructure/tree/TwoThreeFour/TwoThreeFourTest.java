package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoThreeFourTest {
	
	TwoThreeFourTree tree = new TwoThreeFourTree();
	
	// @Test
	public void insertRootEmptyCase()
	{	
		Node node = tree.insert(15);
		
		// behaviour after insert
		
		assertEquals( 15, node.keys[0] );
		assertEquals( 2, node.noOfNode );
		assertEquals( null, node.parent );
	}
	
	// @Test
	public void insertRootTwoKeysSimpleCase()
	{
		tree.insert(15);
		Node node = tree.insert(20);
			
		assertEquals( 15, node.keys[0] );
		assertEquals( 20, node.keys[1] );
		assertEquals( 3, node.noOfNode );
		assertEquals( null, node.parent );
	}
	
	@Test
	public void insertRootTwoKeysComplexCase()
	{
		tree.insert(15);
		Node node = tree.insert(10);
			
		assertEquals( 10, node.keys[0] );
		assertEquals( 15, node.keys[1] );
		assertEquals( 3, node.noOfNode );
		assertEquals( null, node.parent );
	}
	
	@Test
	public void insertRootThreeKeysCase()
	{
		tree.insert(15);
		tree.insert(20);
		Node node = tree.insert(10);
			
		assertEquals( 10, node.keys[0] );
		assertEquals( 15, node.keys[1] );
		assertEquals( 20, node.keys[2] );
		assertEquals( 4, node.noOfNode );
		assertEquals( null, node.parent );
	}
	
	@Test
	public void insertRootOutOfBoundCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		Node node = tree.insert(25);
			
		assertEquals( 10, node.keys[0] );
		assertEquals( 15, node.keys[1] );
		assertEquals( 20, node.keys[2] );
		assertEquals( 4, node.noOfNode );
		assertEquals( null, node.parent );
	}

}
