package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackQueueTest {
	
	@Test
	public void simpleCase()
	{
		StackQueue sq = new StackQueue();
		sq.stackPush('y');
		sq.stackPush('e');
		sq.stackPush('s');
		
		sq.queueEnqueue('y');
		sq.queueEnqueue('e');
		sq.queueEnqueue('s');
		
		char s1 = sq.stackPop();
		char s2 = sq.stackPop();
		char s3 = sq.stackPop();
		
		char q1 = sq.queueDequeue();
		char q2 = sq.queueDequeue();
		char q3 = sq.queueDequeue();
		
		assertEquals( s1, q1 );
		assertEquals( s2, q2 );
		assertEquals( s3, q3 );
		
	}

}
