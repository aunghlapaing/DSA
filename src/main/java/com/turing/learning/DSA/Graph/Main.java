package com.turing.learning.DSA.Graph;

import java.util.List;

public class Main {
	
	public static void main ( String[] args )
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
		
		List<String> adjList = graph.getAdjacentVertex("A");
		System.out.println( "A Vertex's adjence vertex :"  + adjList.toString() );
		
		List<String> dfs = graph.dfs();
		System.out.println( "DFS :"  + dfs.toString() );
		
		List<String> bfs = graph.bfs();
		System.out.println( "BFS :"  + bfs.toString() );
		
	}
	

}
