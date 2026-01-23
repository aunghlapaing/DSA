package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoThreeFourTest {
	
	TwoThreeFourTree tree = new TwoThreeFourTree();

	//@Test
	public void insertRootEmptyCase()
	{	
		Node node = tree.insert(15);
		
		assertEquals( 15, node.keys[0] );
		assertEquals( 2, node.noOfNode );
		assertEquals( null, node.parent );
	}
	
	//@Test
	public void insertRootTwoKeysSimpleCase()
	{
		tree.insert(15);
		Node node = tree.insert(20);
			
		assertEquals( 15, node.keys[0] );
		assertEquals( 20, node.keys[1] );
		assertEquals( 3, node.noOfNode );
		assertEquals( null, node.parent );
	}

	//@Test
	public void insertRootTwoKeysComplexCase()
	{
		tree.insert(15);
		Node node = tree.insert(10);
			
		assertEquals( 10, node.keys[0] );
		assertEquals( 15, node.keys[1] );
		assertEquals( 3, node.noOfNode );
		assertEquals( null, node.parent );
	}
	
	//@Test
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

	//@Test
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
	
	//@Test
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
	
	//@Test
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
		 *          [15]
		 *   [11, 10, 12]    [20]
		 * 
		 * */
			
		assertEquals( 15, parent.keys[0] );
		assertEquals( 10, child0.keys[0] );
		assertEquals( 11, child0.keys[1] );
		assertEquals( 12, child0.keys[2] );
		assertEquals( 20, child1.keys[0] );
		assertEquals( 2, parent.noOfNode );
	}

	//@Test
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
	
	//@Test
	public void insertTwoTreeLeftMostSplitCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(11);
		tree.insert(12);
		Node node = tree.insert(13);
		
		/*
		 *                   [15]
		 *   [10, 11, 12] <- 13     [20]
		 * 
		 * */
		
		Node parent = node.parent;
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
		
		assertEquals( 11, parent.keys[0] );
		assertEquals( 15, parent.keys[1] );
		assertEquals( 10, child0.keys[0] );
		assertEquals( 12, child1.keys[0] );
		assertEquals( 13, child1.keys[1] );
		assertEquals( 20, child2.keys[0] );
		assertEquals( 3, parent.noOfNode );
	}
	
	//@Test
	public void insertThreeTreeRightMostChildCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(25);
		tree.insert(30);
		tree.insert(35);
		Node node = tree.insert(40);
		
		/*
		 *        [15, 25]
		 *   [10]   [20]   [30, 35] <- 40
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
		assertEquals( 35, child2.keys[1] );
		assertEquals( 40, child2.keys[2] );
		
		assertEquals( 3, parent.noOfNode );
	}
	
	//@Test
	public void insertFourTreeRightMostChildCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(25);
		tree.insert(30);
		tree.insert(35);
		tree.insert(40);
		Node node = tree.insert(45);
		
		/*
		 *        [15, 25]
		 *   [10]   [20]   [30, 35, 40] <- 45
		 * 
		 * */
		
		Node parent = node.parent;
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
		Node child3 = parent.child.get(3);		
		
		assertEquals( 15, parent.keys[0] );
		assertEquals( 25, parent.keys[1] );
		assertEquals( 35, parent.keys[2] );
		
		assertEquals( 10, child0.keys[0] );
		assertEquals( 20, child1.keys[0] );
		assertEquals( 30, child2.keys[0] );
		assertEquals( 40, child3.keys[0] );
		assertEquals( 45, child3.keys[1] );
		
		assertEquals( 4, parent.noOfNode );
	}
	
	//@Test
	public void insertFourTreeMiddleMostChildCase()
	{
		tree.insert(15);
		tree.insert(20);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);
		tree.insert(9);
		Node node = tree.insert(10);
		
		/*   
		 *          [6, 15]
		 *   [5]   [7, 8, 9] <- 10    [20]
		 * 
		 * */
		
		Node parent = node.getParent();
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
		Node child3 = parent.child.get(3);
		
		assertEquals( 6, parent.keys[0] );
		assertEquals( 8, parent.keys[1] );
		assertEquals( 15, parent.keys[2] );
		
		assertEquals( 5, child0.keys[0] );
		assertEquals( 7, child1.keys[0] );
		assertEquals( 9, child2.keys[0] );
		assertEquals( 10, child2.keys[1] );
		assertEquals( 20, child3.keys[0] );
		
		assertEquals( 4, parent.noOfNode );
	}
	
	//@Test
	public void insertFourTreeLeftMostChildCase()
	{
		tree.insert(50);
		tree.insert(49);
		tree.insert(55);
		tree.insert(48);
		tree.insert(47);
		tree.insert(46);
		tree.insert(45);
		Node node = tree.insert(44);
		
		/*
		 *                  [ 48, 50]
  		 *    44 -> [45, 46, 47]    [49]     [55]
		 * 
		 * */
		
		Node parent = node.getParent();
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
		Node child3 = parent.child.get(3);
		
		assertEquals( 46, parent.keys[0] );
		assertEquals( 48, parent.keys[1] );
		assertEquals( 50, parent.keys[2] );
		
		assertEquals( 44, child0.keys[0] );
		assertEquals( 45, child0.keys[1] );
		assertEquals( 47, child1.keys[0] );
		assertEquals( 49, child2.keys[0] );
		assertEquals( 55, child3.keys[0] );
		
		assertEquals(4, parent.noOfNode);

	}
	
	//@Test
	public void insertFourTreeLeftMostChildOutOfBoundCase()
	{
		tree.insert(50);
		tree.insert(49);
		tree.insert(55);
		tree.insert(48);
		tree.insert(47);
		tree.insert(46);
		tree.insert(45);
		tree.insert(44);
		Node node = tree.insert(43);
		
		/*
		 *                  [46, 48, 50]
  		 *    43 -> [44, 45]   [47]    [49]     [55]
		 * 
		 * */
		
		Node parent = node.getParent();
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
		Node child3 = parent.child.get(3);
		
		assertEquals( 46, parent.keys[0] );
		assertEquals( 48, parent.keys[1] );
		assertEquals( 50, parent.keys[2] );
		
		assertEquals( 43, child0.keys[0] );
		assertEquals( 44, child0.keys[1] );
		assertEquals( 45, child0.keys[2] );
		assertEquals( 47, child1.keys[0] );
		assertEquals( 49, child2.keys[0] );
		assertEquals( 55, child3.keys[0] );
		
		assertEquals(4, parent.noOfNode);

	}
	
	//@Test
	public void insertFourTreeSplitLeftCase()
	{
		tree.insert(50);
		tree.insert(49);
		tree.insert(55);
		tree.insert(48);
		tree.insert(47);
		tree.insert(46);
		tree.insert(45);
		tree.insert(44);
		tree.insert(43);
		Node node = tree.insert(42);
		
		/*
		 *                  [46, 48, 50]
  		 *   42 -> [43, 44, 45]   [47]    [49]     [55]
		 * 
		 * */
		
		Node parent = node.getParent();
		
		Node currentParent = parent.getParent();
		assertEquals( 48, currentParent.keys[0] );
		assertEquals( 2, currentParent.noOfNode );
		
		Node currentParentChild1 = currentParent.child.get(1);
		assertEquals( 50, currentParentChild1.keys[0] );
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
	
		assertEquals( 44, parent.keys[0] );
		assertEquals( 46, parent.keys[1] );
		
		assertEquals( 42, child0.keys[0] );
		assertEquals( 43, child0.keys[1] );
		assertEquals( 45, child1.keys[0] );
		assertEquals( 47, child2.keys[0] );
			
		assertEquals(3, parent.noOfNode);

	}
	
	//@Test
	public void insertFourTreeSplitLeftMostCase()
	{
		tree.insert(50);
		tree.insert(49);
		tree.insert(55);
		tree.insert(48);
		tree.insert(47);
		tree.insert(46);
		tree.insert(45);
		tree.insert(44);
		tree.insert(43);
		tree.insert(42);
		Node node = tree.insert(41);
		
		/*                                 [48]
		 *                      [44, 46]            [50]
  		 *      41 -> [42, 43]     [45]    [47]   [49]     [55]
		 * 
		 * */
		
		Node parent = node.getParent();
		
		Node currentParent = parent.getParent();
		assertEquals( 48, currentParent.keys[0] );
		assertEquals( 2, currentParent.noOfNode );
		
		Node currentParentChild1 = currentParent.child.get(1);
		assertEquals( 50, currentParentChild1.keys[0] );
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
	
		assertEquals( 44, parent.keys[0] );
		assertEquals( 46, parent.keys[1] );
		
		assertEquals( 41, child0.keys[0] );
		assertEquals( 42, child0.keys[1] );
		assertEquals( 43, child0.keys[2] );
		
		assertEquals( 45, child1.keys[0] );
		assertEquals( 47, child2.keys[0] );
			
		assertEquals(3, parent.noOfNode);

	}
	
	@Test
	public void insertFourTreeSplitLeftMostSplitCase()
	{
		tree.insert(50);
		tree.insert(49);
		tree.insert(55);
		tree.insert(48);
		tree.insert(47);
		tree.insert(46);
		tree.insert(45);
		tree.insert(44);
		tree.insert(43);
		tree.insert(42);
		tree.insert(41);
		Node node = tree.insert(40);
		
		/*                                 [48]
		 *                      [44, 46]             [50]
  		 *      40 -> [41, 42, 43]  [45]  [47]   [49]     [55]
		 * 
		 * */
		
		Node parent = node.getParent();
		
		Node currentParent = parent.getParent();
		assertEquals( 48, currentParent.keys[0] );
		assertEquals( 2, currentParent.noOfNode );
		
		Node currentParentChild0 = currentParent.child.get(0);
		assertEquals( 42, currentParentChild0.keys[0] );
		assertEquals( 44, currentParentChild0.keys[1] );
		assertEquals( 46, currentParentChild0.keys[2] );
		
		Node currentParentChild1 = currentParent.child.get(1);
		assertEquals( 50, currentParentChild1.keys[0] );
		
		Node child0 = parent.child.get(0);
		Node child1 = parent.child.get(1);
		Node child2 = parent.child.get(2);
		Node child3 = parent.child.get(3);
		
		assertEquals( 42, parent.keys[0] );
		assertEquals( 44, parent.keys[1] );
		assertEquals( 46, parent.keys[2] );
		
		assertEquals( 40, child0.keys[0] );
		assertEquals( 41, child0.keys[1] );
		
		assertEquals( 43, child1.keys[0] );
		
		assertEquals( 45, child2.keys[0] );
		
		assertEquals( 47, child3.keys[0] );
			
		assertEquals(4, parent.noOfNode);

	}
	
	@Test
	public void insertFourTreeCurrentParentSplitLeftMostSplitCase()
	{
		tree.insert(50);
		tree.insert(49);
		tree.insert(55);
		tree.insert(48);
		tree.insert(47);
		tree.insert(46);
		tree.insert(45);
		tree.insert(44);
		tree.insert(43);
		tree.insert(42);
		tree.insert(41);
		tree.insert(40);
		tree.insert(39);
		Node node = tree.insert(38);
		assertEquals( 38, node.keys[0] );
		
		/*                                         [48]
		 *                      [42, 44, 46]                             [50]
  		 *      38 -> [39, 40, 41]    [43]    [45]    [47]          [49]     [55]
		 * 
		 * */
		
		Node parent = node.getParent();
		Node child0 = parent.child.get(0);
		assertEquals( 42, child0.keys[0] );
		
		
		
//		Node currentParent = parent.getParent();
//		assertEquals( 44, currentParent.keys[0] );
//		assertEquals( 48, currentParent.keys[1] );
//		assertEquals( 3, currentParent.noOfNode );
//		
//		Node currentParentChild0 = currentParent.child.get(0);
//		assertEquals( 40, currentParentChild0.keys[0] );
//		assertEquals( 42, currentParentChild0.keys[1] );
//		
//		Node currentParentChild1 = currentParent.child.get(1);
//		assertEquals( 46, currentParentChild1.keys[0] );
//		
//		Node currentParentChild2 = currentParent.child.get(2);
//		assertEquals( 50, currentParentChild2.keys[0] );
		
//		Node child0 = parent.child.get(0);
//		Node child1 = parent.child.get(1);
//		Node child2 = parent.child.get(2);
//		
//		assertEquals( 42, parent.keys[0] );
//		assertEquals( 44, parent.keys[1] );
//		assertEquals( 46, parent.keys[2] );
//		
//		assertEquals( 38, child0.keys[0] );
//		assertEquals( 39, child0.keys[1] );
//		
//		assertEquals( 41, child1.keys[0] );
//		
//		assertEquals( 43, child2.keys[0] );
//
//		assertEquals(3, parent.noOfNode);

	}
	
}
