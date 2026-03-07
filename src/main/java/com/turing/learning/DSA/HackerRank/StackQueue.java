package com.turing.learning.DSA.HackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackQueue {
	
	Stack<Character> stack;
    Deque<Character> queue;
    
   StackQueue()
    {
        this.stack = new Stack<Character>(); 
        this.queue = new ArrayDeque<Character>(); 
    }
	
	public void stackPush(char c)
	{
		stack.push(c);
	}
	
	public void queueEnqueue( char c )
	{
		queue.addLast(c);
	}
	
	public char stackPop()
	{
		System.out.println( "Stack peek:" + stack.peek() );
		return stack.pop();
	}
	
	public char queueDequeue()
	{
		System.out.println("Queue peek:" + queue.peekLast());
		return queue.removeLast();
	}
	

}
