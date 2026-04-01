package com.turing.learning.DSA.JavaHackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class ComparableWithPQTest {
	
	// compare mark
	// if mark same, compare ID
	
	@Test
	public void simpleCase()
	{
		ComparableWithPQ cpq = new ComparableWithPQ();
		
		List<List<Integer>> event = new ArrayList<List<Integer>>();
		List<Integer> student1 = new ArrayList<>();
		
		student1.add(20); // id
		student1.add(90); // mark
		
		event.add(student1);
		
		List<Integer> student2 = new ArrayList<>();
		student2.add(21);
		student2.add(80);
		
		event.add(student2);
		
		List<Integer> result = cpq.getPriority(event);
		assertEquals( 90, result.get(1) );
			
	}

}
