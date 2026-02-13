package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightedGraph extends GraphAdjMatrix {
	
	int MAX_WEIGHT = Integer.MAX_VALUE;
	
	public void build() 
	{
		int n = this.vertices.size();
		this.matrix = new int [n][n];
		
		for ( int i = 0; i < n; i++ )
		{
			for ( int j = 0; j < n; j++ )
			{
				this.matrix[i][j] = MAX_WEIGHT;
			}
		}
		
	}
	
	public void addEdge(String from, String to, int weight) 
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		this.matrix [fromIndex][toIndex] = weight;
		this.matrix [toIndex][fromIndex] = weight;
		
	}
	
	public boolean exitEdge( String from, String to )
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		return this.matrix [fromIndex][toIndex] != MAX_WEIGHT;
	}
	
	public List<Edge> getAdjEdges(List<String> visited)
	{
		this.markedVisited( visited );
		List<Edge> list = new ArrayList<Edge>();
		
		for ( int i = 0; i < visited.size(); i++ )
		{
			String fromVertex = visited.get(i);
			getAdjEdgesForGraph(list, fromVertex);
		}

		Collections.sort(list);
		
		return list;
	}

	private void markedVisited(List<String> visited) 
	{
		for( int i = 0; i < visited.size(); i++ )
		{
			String fromVertex = visited.get(i);
			for ( String vertex : visited )
			{
				if ( !fromVertex.equals(vertex) )
				{
					if ( this.exitEdge(fromVertex, vertex) )
					{
						int fromIndex = this.vertices.indexOf(fromVertex);
						int toIndex = this.vertices.indexOf(vertex);

						this.matrix [fromIndex][toIndex] = MAX_WEIGHT;
						this.matrix [toIndex][fromIndex] = MAX_WEIGHT;
					}
				}
			}
		}
	}

	public void getAdjEdgesForGraph(List<Edge> list, String fromVertex) 
	{
		for( String vertex : this.vertices )
		{
			if( !fromVertex.equals(vertex) )
			{
				if ( this.exitEdge(fromVertex, vertex) )
				{
					int fromIndex = this.vertices.indexOf(fromVertex);
					int toIndex = this.vertices.indexOf(vertex);
					
					int weight = this.matrix [fromIndex][toIndex];
					
					Edge edge = new Edge( fromVertex, vertex, weight );	
	
					list.add(edge);
				}
			}
		}
	}

	public List<String> primAlgo()
	{
		// we will add only edge in visited list
		List<String> visited = new ArrayList<String>();
		
		String currentVertex = this.vertices.get(0);
		visited.add(currentVertex);
		
		int noOfVertices = this.vertices.size();
		int noOfEdge = 0;
		
		while( noOfEdge < noOfVertices - 1 )
		{
			List<Edge> edge = this.getAdjEdges(visited);
			
			Edge smallestEdge = edge.get(0);
			System.out.println("Edge :" + smallestEdge.fromVertex + "-" + smallestEdge.toVertex + "=" + smallestEdge.weight );
			
			if ( visitedToEqualOrNotEqual(visited, smallestEdge))
			{
				String addVertex = smallestEdge.toVertex;
				visited.add(addVertex);
			}
			else if ( visitedFromEqual(visited, smallestEdge) )
			{
				String addVertex = smallestEdge.toVertex;
				visited.add(addVertex);
			}
			noOfEdge++;
			
		}	
		return visited;
	}

	public boolean visitedFromEqual(List<String> visited, Edge smallestEdge) {
		return smallestEdge.fromVertex.equals(visited.get(0));
	}

	public boolean visitedToEqualOrNotEqual(List<String> visited, Edge smallestEdge) {
		return smallestEdge.fromVertex.equals(visited.get(visited.size()-1)) || !smallestEdge.fromVertex.equals(visited.get(visited.size()-1));
	}
}
