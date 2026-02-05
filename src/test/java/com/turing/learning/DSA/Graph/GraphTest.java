package com.turing.learning.DSA.Graph;

import org.junit.jupiter.api.Test;

public class GraphTest {
	
	/*
	 * add vertices
	 * build
	 * add edges
	 * 
	 * */
	
	@Test
	public void buildGraphCase()
	{
		Graph graph = new GraphAMatrix();
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
		
	}

}
