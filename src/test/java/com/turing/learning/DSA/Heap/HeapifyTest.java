package com.turing.learning.DSA.Heap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HeapifyTest {
	
	Heap heap = new Heap();
	HeapUtil util = new HeapUtil();
	
	@Test
	public void insertMaxCase()
	{
		heap.insert(1);
		heap.insert(8);
		heap.insert(2);
		heap.insert(4);
		heap.insert(6);
		heap.insert(10);
		
		// [1, 8, 2, 4, 6, 10 ]
		
		assertEquals( 6, heap.list.size() );
		assertEquals( 10, heap.peek() );
	}
	
	@Test
	public void inputArrayCase()
	{
		Integer[] list = { 1, 8, 2, 4, 6, 10 };
		
		List<Integer> data = heap.setData(Arrays.asList(list));
		
		assertTrue( util.heapUtil(data) );
		
		assertEquals( 10, heap.peek() );
	}
	
	@Test
	public void deleteLeafPositiveCase()
	{
		Integer[] list = { 1, 8, 2, 4, 6, 10 };
		
		List<Integer> data = heap.setData(Arrays.asList(list));
		
		assertTrue( util.heapUtil(data) );
		
		ArrayList<Integer> data1 = heap.delete(10);
		assertTrue( util.heapUtil(data1) );
		
	}
	
	@Test
	public void deleteLeafNegativeCase()
	{
		Integer[] list = { 1, 8, 2, 4, 6, 10 };
		
		List<Integer> data = heap.setData(Arrays.asList(list));
		
		assertTrue( util.heapUtil(data) );
		
		RuntimeException except = assertThrows ( RuntimeException.class, ()-> {
			heap.delete(11);
		} );
		assertEquals( "Delete Item not found.", except.getMessage() );
		
	}
	
	
}
