package com.turing.learning.DSA.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Iterator;

import org.junit.Test;

public class LinkedListTest {
	
	LinkedList list = new LinkedList();
	
	
	@Test
	public void addFirstCase()
	{
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		assertEquals( 10, list.getLastNode().getValue());
		
		Iterator iterator = list.iterator();
		
		assertEquals( 30, ((Node)iterator.next()).getValue() );	
		assertEquals( 20, ((Node)iterator.next()).getValue() );
		assertEquals( 10, ((Node)iterator.next()).getValue() );	
		
	}

	@Test
	public void addLastCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		// copy references
		Node newNode = list.firstNode;
		while ( newNode.next != null )
		{
			System.out.println("Node : " + newNode.getValue());
			newNode = newNode.getNext();
		}
		
		System.out.println("Last Node :" + newNode.getValue());
		
		Iterator iterator = list.iterator();
		
		assertEquals( 10, ((Node)iterator.next()).getValue() );
		assertEquals( 20, ((Node)iterator.next()).getValue() );
		assertEquals( 30, ((Node)iterator.next()).getValue() );
		
	}
	
	
	
	@Test
	public void addFirstaddListMixedCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(0);
		
		Iterator iterator = list.iterator();
		
		assertEquals( 0, ((Node)iterator.next()).getValue() );
		assertEquals( 10, ((Node)iterator.next()).getValue() );
		assertEquals( 20, ((Node)iterator.next()).getValue() );
		assertEquals( 30, ((Node)iterator.next()).getValue() );
	}
	
	@Test
	public void findPositiveCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		// [10 -> 20 -> 30 ]
		
		Iterator iterator = list.iterator();
		
		int item = ((Node)list.find(20)).getValue();
		
		assertEquals(20, item);
		assertEquals(30, ((Node)list.find(30)).getValue() );
		assertEquals(10, ((Node)list.find(10)).getValue());		
	}
	
	@Test
	public void findNegativeCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		// [10 -> 20 -> 30 ]
		
		Iterator iterator = list.iterator();
		
		int item = ((Node)list.find(20)).getValue();
		
		assertEquals(20, item);
		assertEquals(30, ((Node)list.find(30)).getValue());
		assertEquals(10, ((Node)list.find(10)).getValue());		
		
		assertEquals (null, list.find(50));
	}
	
	@Test
	public void deleteNegativeCase() 
	{
		
		Iterator iterator = list.iterator();
		
		Node deleteNode = list.delete(30);
		
		assertEquals( null, deleteNode );
	}
	
	@Test
	public void deletePostiveFirstCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		int item =((Node)list.delete(10)).getValue();
		
		assertEquals( 10, item);
		
		Iterator iterator = list.iterator();
		
		//assertEquals( 10, ((Node)iterator.next()).getValue());
		assertEquals( 20, ((Node)iterator.next()).getValue());
		assertEquals( 30, ((Node)iterator.next()).getValue());
	}
	
	@Test
	public void deletePostiveMiddleCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		int item =((Node)list.delete(20)).getValue();
		
		assertEquals( 20, item);
		
		Iterator iterator = list.iterator();
		
		assertEquals( 10, ((Node)iterator.next()).getValue());
		//assertEquals( 20, ((Node)iterator.next()).getValue());
		assertEquals( 30, ((Node)iterator.next()).getValue());
	}
	
	@Test
	public void deletePostiveLastCase()
	{
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		int item =((Node)list.delete(30)).getValue();
		
		assertEquals( 30, item);
		
		Iterator iterator = list.iterator();
		
		assertEquals( 10, ((Node)iterator.next()).getValue());
		assertEquals( 20, ((Node)iterator.next()).getValue());
		//assertEquals( 30, ((Node)iterator.next()).getValue());
		
		assertFalse(iterator.hasNext());
	}
	

}
