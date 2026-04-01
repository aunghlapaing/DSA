package com.turing.learning.DSA.JavaHackerRank;

import java.util.*;

public class ComparableWithPQ {

	public List<Integer> getPriority(List<List<Integer>> event) {
		
		List<Integer> result = new ArrayList<>();
		
		PriorityQueue<Student> pq = new PriorityQueue<>(
				Comparator.comparing(Student::getMark).reversed()
						  .thenComparing(Student::getID)
				);
		
		for( List<Integer> i : event )
		{
			Student student = new Student( i.get(0), i.get(1) );
			pq.add(student);
		}
		
		while( !pq.isEmpty() )
		{
			Student firstPriority = pq.poll();
			result.add(firstPriority.getID());
			result.add(firstPriority.getMark());
			
		}	
		return result;
	}

}
