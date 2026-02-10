package com.turing.learning.DSA.Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WeightedGraphTest {
	
	WeightedGraph graph = new WeightedGraph();
	
	public WeightedGraphTest()
	{
		graph.addVertices("A");
		graph.addVertices("B");
		graph.addVertices("C");
		graph.addVertices("D");
		graph.addVertices("E");
		graph.addVertices("F");
		
		graph.build();
		
		graph.addEdge("A", "B", 3);
		graph.addEdge("A", "C", 4);
		graph.addEdge("C", "E", 3);
		graph.addEdge("C", "D", 6);
		graph.addEdge("B", "E", 1);
		graph.addEdge("E", "F", 5);
	}
	
	@Test
	public void weightedGraphCase() 
	{
		List<String> list = graph.getAdjVertices("A");
		Iterator<String> iterator = list.iterator();
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertFalse( iterator.hasNext() );
	}

}
