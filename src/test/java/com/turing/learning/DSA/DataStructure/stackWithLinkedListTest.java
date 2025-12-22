package com.turing.learning.DSA.DataStructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class stackWithLinkedListTest {
	StackWithLinkedList stack = new StackWithLinkedList();
	@Test
	public void pushSingleItemCase()
	{
		stack.push(10);
		int size = stack.size();
		assertEquals( 1, size );
		
		assertEquals( 10, stack.peek() );
		
	}
	
	@Test
	public void pushManyItemCase()
	{
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		//assertEquals( 3, stack.size() );
		
		assertEquals( 30, stack.peek() );
	}
	
	@Test
	public void popSingleItemCase()
	{
		stack.push(10);
		stack.push(20);
		
		stack.pop();
		
		assertEquals(1, stack.size());
		assertEquals(10, stack.peek());

	}
	
	@Test
	public void popManyItemCase()
	{
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		assertEquals(1, stack.size());
		
		assertEquals( 10, stack.peek() );
		
	}
	

}
