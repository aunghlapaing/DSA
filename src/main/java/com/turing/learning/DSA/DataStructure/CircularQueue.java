package com.turing.learning.DSA.DataStructure;

public class CircularQueue extends Queue {
	
	int size = 0;
	
	public int size()
	{
		return this.size;
	}
	
	public boolean isFull()
	{
		return this.size == arr.length;
	}
	
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	
	public void enqueue(int item)
	{
		//Queue is full state
		if ( isFull() )
		{
			throw new RuntimeException("Queue is full.");
		}
		//Queue is not full
		else
		{
			this.tail = this.tail % this.arr.length;
			this.arr[this.tail++] = item;
			this.size++;
		}
	}
	
	public int dequeue( )
	{
		if ( isEmpty() )
		{
			throw new RuntimeException("Queue is empty.");
		}
		else
		{
			this.head = this.head % this.arr.length;
			this.size--;
			return this.arr[head++];
		}
		
	}
}
