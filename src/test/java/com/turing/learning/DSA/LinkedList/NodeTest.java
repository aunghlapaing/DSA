package com.turing.learning.DSA.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class NodeTest {
	
	@Test
	public void nodeTest()
	{
		LinkedList list = new LinkedList();
		
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		first.setNext(second);
		second.setNext(third);
		
		list.addFirst(first);
		
		// [10->20->30->]
		
		Iterator iterator = list.iterator();
		
		assertEquals( first, iterator.next());
		assertEquals( second, iterator.next());
		assertEquals( third, iterator.next());
		
	}

}
