package com.turing.learning.DSA.DataStructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class StackTest {
	
	Stack stack = new Stack(10);
	
	@Test
	public void emptyCase()
	{
		assertEquals(0, stack.size());
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void pushSingleItemCase()
	{
		stack.push(10);
		
		assertEquals(1, stack.size());
	}
	
	@Test
	public void peekSingleItemCase()
	{
		stack.push(10);
		int peekItem = stack.peek();
		assertEquals(1, stack.size());
		assertEquals(10, peekItem);
	}
	
	@Test
	public void popSingleItemCase()
	{
		stack.push(10);
		stack.push(20);
		
		assertEquals(20, stack.peek());
	
		int popItem = stack.pop();
		assertEquals(1, stack.size());
		assertEquals(20, popItem);
	}

}
