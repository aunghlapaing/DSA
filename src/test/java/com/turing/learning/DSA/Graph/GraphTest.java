package com.turing.learning.DSA.Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GraphTest {
	
	Graph graph = new GraphAMatrix();
	//Graph graph = new GraphAdjList();
	
	/*
	 * add vertices
	 * build
	 * add edges
	 * DFS
	 * BFS
	 * 
	 * */
	
	@Test
	public void buildGraphCase()
	{
		graph.addVertices("A");
		graph.addVertices("B");
		graph.addVertices("C");
		graph.addVertices("D");
		graph.addVertices("E");
		graph.addVertices("F");
		
		graph.build();
		
		graph.addEdges("A", "B");
		graph.addEdges("A", "C");
		graph.addEdges("B", "E");
		graph.addEdges("C", "D");
		graph.addEdges("E", "C");
		graph.addEdges("E", "F");
		
		List<String> list = graph.getAdjacentVertex("A");
		
		Iterator<String> iterator = list.iterator();
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertFalse( iterator.hasNext() );
		
		list = graph.getAdjacentVertex("C");
		
		iterator = list.iterator();
		assertEquals( "A", iterator.next() );
		assertEquals( "D", iterator.next() );
		assertEquals( "E", iterator.next() );
		assertFalse( iterator.hasNext() );
		
	}
	
	@Test
	public void dfsCase()
	{
		graph.addVertices("A");
		graph.addVertices("B");
		graph.addVertices("C");
		graph.addVertices("D");
		graph.addVertices("E");
		graph.addVertices("F");
		
		graph.build();
		
		graph.addEdges("A", "B");
		graph.addEdges("A", "C");
		graph.addEdges("B", "E");
		graph.addEdges("C", "D");
		graph.addEdges("E", "C");
		graph.addEdges("E", "F");
		
		List<String> list = graph.dfs();
		
		// A->B->E->C->D->F
		
		Iterator<String> iterator = list.iterator();
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
		graph.addVertices("A");
		graph.addVertices("B");
		graph.addVertices("C");
		graph.addVertices("D");
		graph.addVertices("E");
		graph.addVertices("F");
		
		graph.build();
		
		graph.addEdges("A", "B");
		graph.addEdges("A", "C");
		graph.addEdges("B", "E");
		graph.addEdges("C", "D");
		graph.addEdges("E", "C");
		graph.addEdges("E", "F");
		
		List<String> list = graph.bfs();
		
		// A->B->C->E->F->D
		
		Iterator<String> iterator = list.iterator();
		assertEquals( "A", iterator.next() );
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertEquals( "E", iterator.next() );
		assertEquals( "D", iterator.next() );
		assertEquals( "F", iterator.next() );
		assertFalse( iterator.hasNext() );
		
	}

}
