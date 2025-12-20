package com.turing.learning.DSA.DataStructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CircularQueueTest {
	
	Queue queue = new CircularQueue();
	
	@Test
	public void enqueueSimpleCase()
	{
		queue.enqueue(100);
		queue.enqueue(200);
		
		int size = queue.size();
		
		assertEquals( 2, size );
		assertEquals(100, queue.peek());
	}
	
	@Test 
	public void dequeueSimpleCase()
	{
		queue.enqueue(100);
		queue.enqueue(200);
		
		int size = queue.size();
		
		assertEquals( 2, size );
		
		queue.dequeue();
		assertEquals( 200, queue.peek());
	}
	
	@Test
	public void dequeueOutofBoundCase()
	{
		for ( int i = 0; i < 10; i++ )
		{
			queue.enqueue(i);
		}
		assertEquals( 10, queue.size() );
		
		for ( int i = 0; i < 10; i++ )
		{
			int item = queue.dequeue();
			assertEquals( i, item );
		}	
		
		RuntimeException except = assertThrows( RuntimeException.class, ()-> {
			queue.dequeue();
		} );
		assertEquals( "Queue is empty.", except.getMessage());
		assertEquals( 0, queue.size());
	}
	
	@Test
	public void circularQueueCase()
	{
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);

		queue.dequeue();
		queue.dequeue();
		
		int size = queue.size();
		assertEquals( 1, size );
		
		queue.enqueue(400);
		assertEquals( 300, queue.peek() );
		
		assertEquals( 2, size );
	}
}
