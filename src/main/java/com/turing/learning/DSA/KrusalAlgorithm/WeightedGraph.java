package com.turing.learning.DSA.KrusalAlgorithm;

import java.util.List;
import java.util.ArrayList;

public class WeightedGraph {
	
	int[][] arr;
	List<String> vertices = new ArrayList<String>();
	int MAX_WEIGHT = Integer.MAX_VALUE;

	public void addVertices(String string) 
	{
		this.vertices.add(string);
		
	}

	public void build() 
	{
		int n = this.vertices.size();
		arr = new int[n][n];
		for( int i = 0; i < n; i++ )
		{
			for ( int j = 0; j < n; j++ )
			{
				arr[i][j] = MAX_WEIGHT;
			}
		}
	}

	public void addEdge(String fromVertex, String toVertex, int weight) 
	{
		int fromIndex = this.vertices.indexOf(fromVertex);
		int toIndex = this.vertices.indexOf(toVertex);
		
		arr[fromIndex][toIndex] = weight;
		arr[toIndex][fromIndex] = weight;
 		
	}

	public List<String> getAdjVertices(String fromVertex) 
	{
		List<String> adjVertex = new ArrayList<String>();
		
		for( String vertex : this.vertices )
		{
			if( exitEdges( fromVertex, vertex ) )
			{
				if( !fromVertex.equals(vertex) )
				{
					adjVertex.add(vertex);
				}
			}
		}
		return adjVertex;
	}
	
	public boolean exitEdges( String fromVertex, String toVertex )
	{
		int fromIndex = this.vertices.indexOf(fromVertex);
		int toIndex = this.vertices.indexOf(toVertex);
		
		return arr[fromIndex][toIndex] != MAX_WEIGHT;
	}

}
