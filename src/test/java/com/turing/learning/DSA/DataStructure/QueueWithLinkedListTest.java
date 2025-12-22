package com.turing.learning.DSA.DataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueWithLinkedListTest {

	QueueWithLinkedList queue = new QueueWithLinkedList();
	
	@Test 
	public void enqueueCase()
	{
		queue.enQueue(10);
		
		assertEquals(1, queue.size());
		
		assertEquals(10, queue.peek());
		
	}
	
	@Test 
	public void enQueueManyItemCase()
	{
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		
		assertEquals(3, queue.size());
		
		assertEquals(10, queue.peek());
		
	}
	
	@Test
	public void deQueueSingleItemCase()
	{
		queue.enQueue(10);
		
		queue.deQueue();
		
		assertEquals(0, queue.size());
	}
	
	@Test
	public void deQueueManyItemCase()
	{
		queue.enQueue(10);
		queue.enQueue(20);
		
		queue.deQueue();
		
		assertEquals(1, queue.size());
		assertEquals(20, queue.peek());
		
	}
	
	@Test
	public void deQueueOutOfBoundCase()
	{
		for ( int i = 0; i < 10; i++ )
		{
			queue.enQueue(i);
		}
		for ( int j = 9; j >= 0; j-- )
		{
			queue.deQueue();
		}
		assertEquals(0, queue.size());
	}
	

}
