package com.turing.learning.DSA.Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
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
	
	//@Test
	public void weightedGraphCase() 
	{
		List<String> list = graph.getAdjVertices("A");
		Iterator<String> iterator = list.iterator();
		assertEquals( "B", iterator.next() );
		assertEquals( "C", iterator.next() );
		assertFalse( iterator.hasNext() );
	}
	
	//@Test
	public void getEdgeSimpleCase()
	{
		List<String> vertices = new ArrayList<>();
		vertices.add( "A" );
		List<Edge> list = graph.getAdjEdges(vertices);
		Iterator<Edge> iterator = list.iterator();
		assertEquals("A - B = 3", iterator.next().toString());
		assertEquals("A - C = 4", iterator.next().toString());
		assertFalse( iterator.hasNext() );
	}
	
	@Test
	public void getEdgeWithTwoVerticesCase()
	{
		List<String> vertices = new ArrayList<>();
		vertices.add( "A" );
		vertices.add( "B" );
		List<Edge> list = graph.getAdjEdges(vertices);
		Iterator<Edge> iterator = list.iterator();
		assertEquals("B - E = 1", iterator.next().toString());
		assertEquals("A - C = 4", iterator.next().toString());
		assertFalse( iterator.hasNext() );
	}
	
	@Test
	public void getEdgeComplexCase()
	{
		List<String> vertices = new ArrayList<>();
		vertices.add( "A" );
		vertices.add( "B" );
		vertices.add( "E" );
		vertices.add( "C" );
		vertices.add( "F" );
		vertices.add( "D" );
		List<Edge> list = graph.getAdjEdges(vertices);
		Iterator<Edge> iterator = list.iterator();
		assertFalse( iterator.hasNext() );
	}
	
	@Test
	public void primAlgorithmCase()
	{
		List<String> list = graph.primAlgo();
		Iterator<String> iterator = list.iterator();
		assertEquals("A", iterator.next());
		assertEquals("B", iterator.next());
		assertEquals("E", iterator.next());
		assertEquals("C", iterator.next());
		assertEquals("F", iterator.next());
		assertEquals("D", iterator.next());
		assertFalse( iterator.hasNext() );
		
	}
}
