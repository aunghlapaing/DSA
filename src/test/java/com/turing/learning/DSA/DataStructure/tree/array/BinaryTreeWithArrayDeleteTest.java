package com.turing.learning.DSA.DataStructure.tree.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class BinaryTreeWithArrayDeleteTest {
	
	BinaryTreeWithArray tree = new BinaryTreeWithArray();

	
	@Test
	public void deleteEmptyCase()
	{
		Integer item = tree.delete(17);
		
		assertNull(item);
	}
	
	@Test
	public void deleteRootCase()
	{
		tree.insert(17);
		
		Integer item = tree.delete(17);
		assertEquals( 17, item );
		
		int index = tree.search(17);
		assertEquals( -1, index );
		
	}
	
	@Test
	public void deleteLeftChildCase()
	{
		tree.insert(17);
		tree.insert(15);
		
		Integer item = tree.delete(15);
		assertEquals( 15, item );
		
		int index = tree.search(15);
		assertEquals( -1, index );
	}

}
