package com.turing.learning.DSA.DataStructure;

public class Queue {

	int[] arr;
	int head = 0;
	int tail = 0;
	
	public Queue()
	{
		this.arr = new int[10];
	}

	public void enqueue(int item) 
	{
		this.arr[tail++] = item;
	}

	public int size() 
	{
		return this.tail - this.head;
	}

	public int peek() 
	{
		return this.arr[this.head];
	}

	public int dequeue() 
	{
		if ( this.size() == 0 )
		{
			throw new RuntimeException ( "Queue is empty" );
		}
		else
		{
			return this.arr[this.head++];
		}
		
	}

}
