package com.turing.learning.DSA.KrusalAlgorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import java.util.List;

public class WeightedGragphTest {
	
	/* 
	AdjMatrix
	addVertices
	build
	addEdges
	*/
	
	@Test
	public void buildGraphBaseCase()
	{
		WeightedGraph graph = new WeightedGraph();
		
		graph.addVertices("A");
		graph.addVertices("B");
		graph.addVertices("C");
		graph.addVertices("D");
		graph.addVertices("E");
		graph.addVertices("F");
		
		graph.build();
		
		/*
		A->B 4
		A->C 4
		B->C 2
		C->D 3
		C->E 2
		C->F 4
		D->F 3
		E->F 3
		*/
		graph.addEdge("A", "B", 4 );
		graph.addEdge("A", "C", 4 );
		graph.addEdge("B", "C", 2 );
		graph.addEdge("C", "D", 3 );
		graph.addEdge("C", "E", 2 );
		graph.addEdge("C", "F", 4 );
		graph.addEdge("D", "F", 3 );
		graph.addEdge("E", "F", 3 );
		
		assertEquals( 6, graph.arr.length );
		
		List<String> vertices = graph.getAdjVertices( "A" );
		Iterator<String> iterator = vertices.iterator();
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		
		
	}

}
