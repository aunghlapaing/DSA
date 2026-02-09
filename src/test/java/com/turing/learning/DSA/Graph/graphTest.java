package com.turing.learning.DSA.Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class graphTest {
	
	@Test
	public void graphWithAdjListCase()
	{
		GraphAdjList graph = new GraphAdjList();
		
		graph.addVertices("A");
		graph.addVertices("B");
		graph.addVertices("C");
		graph.addVertices("D");
		graph.addVertices("E");
		graph.addVertices("F");
		
		graph.build();
		
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("C", "E");
		graph.addEdge("C", "F");
		graph.addEdge("B", "E");
		graph.addEdge("B", "D");
		graph.addEdge("D", "E");
		
		List<String> adjVertices = graph.getAdjVertices("A");
		Iterator<String> iterator = adjVertices.iterator();
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertFalse( iterator.hasNext() );
	}

}
