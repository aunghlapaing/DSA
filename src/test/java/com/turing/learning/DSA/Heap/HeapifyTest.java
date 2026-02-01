package com.turing.learning.DSA.Heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HeapifyTest {
	
	@Test
	public void insertCase()
	{
		Heap heap = new Heap();
		heap.insert(10);
		heap.insert(8);
		heap.insert(2);
		heap.insert(4);
		heap.insert(6);
		heap.insert(1);
		heap.insert(5);
		heap.insert(7);
		
		assertEquals( 8, heap.list.size() );
		
		// [10, 8, 2, 4, 6, 1, 5, 7]
		
		
	}

}
