package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoThreeFourTest {
	
	TwoThreeFourTree tree = new TwoThreeFourTree();
	
	
	@Test
	public void insertRootEmptyCase()
	{	
		Node node = tree.insert(15);
		
		// behaviour after insert
		
		assertEquals( 15, node.keys[0] );
		assertEquals( 2, node.noOfNode );
		assertEquals( null, node.parent );
	}
	
	
	@Test
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
	public void insertRootSplitCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		Node node = tree.insert(25);
		
		Node parent = node.parent;
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
			
		assertEquals( 15, parent.keys[0] );
		assertEquals( 10, child0.keys[0] );
		assertEquals( 20, child1.keys[0] );
		assertEquals( 25, child1.keys[1] );
		assertEquals( 2, parent.noOfNode );
	}
	
	
	@Test
	public void insertTwoTreeRightMostCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(25);
		Node node = tree.insert(30);
		
		Node parent = node.parent;
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		
		/*
		 *        [15]
		 *   [10]     [20, 25, 30]
		 * 
		 * */
			
		assertEquals( 15, parent.keys[0] );
		assertEquals( 10, child0.keys[0] );
		assertEquals( 20, child1.keys[0] );
		assertEquals( 25, child1.keys[1] );
		assertEquals( 30, child1.keys[2] );
		assertEquals( 2, parent.noOfNode );
	}
	
	@Test
	public void insertTwoTreeLefttMostCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(11);
		Node node = tree.insert(12);
		
		Node parent = node.parent;
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		
		/*
		 *        [15]
		 *   [10]     [20, 25, 30]
		 * 
		 * */
			
		assertEquals( 15, parent.keys[0] );
		assertEquals( 10, child0.keys[0] );
		assertEquals( 11, child0.keys[1] );
		assertEquals( 12, child0.keys[2] );
		assertEquals( 20, child1.keys[0] );
		assertEquals( 2, parent.noOfNode );
	}

	@Test
	public void insertTwoTreeRigthMostSplitCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(25);
		tree.insert(30);
		Node node = tree.insert(33);
		
		/*
		 *        [15]
		 *   [10]     [20, 25, 30] <- 35
		 * 
		 * */
		
		Node parent = node.parent;
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
		
		
		assertEquals( 15, parent.keys[0] );
		assertEquals( 25, parent.keys[1] );
		assertEquals( 10, child0.keys[0] );
		assertEquals( 20, child1.keys[0] );
		assertEquals( 30, child2.keys[0] );
		assertEquals( 33, child2.keys[1] );
		assertEquals( 3, parent.noOfNode );
	}
	
}
