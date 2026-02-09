package com.turing.learning.DSA.Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class graphTest {
	
	Graph graph = new GraphAdjList();
	//Graph graph = new GraphAdjMatrix();
	
	graphTest()
	{
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
		graph.addEdge("C", "D");
		graph.addEdge("B", "E");
		graph.addEdge("E", "F");
	}
	
	@Test
	public void graphWithAdjListCase()
	{

		List<String> adjVertices = graph.getAdjVertices("A");
		Iterator<String> iterator = adjVertices.iterator();
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertFalse( iterator.hasNext() );
		
		adjVertices = graph.getAdjVertices("B");
		iterator = adjVertices.iterator();
		assertEquals( "A", iterator.next() );
		assertEquals( "E", iterator.next() );
		assertFalse( iterator.hasNext() );
		
		/*
		adjVertices = graph.getAdjVertices("C");
		iterator = adjVertices.iterator();
		assertEquals( "A", iterator.next() );
		assertEquals( "E", iterator.next() );
		assertEquals( "D", iterator.next() );
		assertFalse( iterator.hasNext() );
		*/
	}
	
	@Test
	public void dfsCase()
	{
		// A->B->E->C->D->F
		
		List<String> dfs = graph.dfs();
		Iterator<String> iterator = dfs.iterator();
		assertEquals( "A", iterator.next() );
		assertEquals( "B", iterator.next() );
		assertEquals( "E", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertEquals( "D", iterator.next() );
		assertEquals( "F", iterator.next() );
		assertFalse( iterator.hasNext() );
		
	}
	
	@Test
	public void bfsCase()
	{
		// A->B->C->E->D->F
		
		List<String> bfs = graph.bfs();
		Iterator<String> iterator = bfs.iterator();
		assertEquals( "A", iterator.next() );
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertEquals( "E", iterator.next() );
		assertEquals( "D", iterator.next() );
		assertEquals( "F", iterator.next() );
		assertFalse( iterator.hasNext() );
		
	}

}
