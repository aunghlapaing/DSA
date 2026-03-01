package com.turing.learning.DSA.KrusalAlgorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WeightedGraph {
	
	protected int[][] arr;
	protected List<String> vertices = new ArrayList<String>();
	protected int MAX_WEIGHT = Integer.MAX_VALUE;

	protected void addVertices(String string) 
	{
		this.vertices.add(string);
	}

	protected void build() 
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

	protected void addEdge(String fromVertex, String toVertex, int weight) 
	{
		int fromIndex = this.vertices.indexOf(fromVertex);
		int toIndex = this.vertices.indexOf(toVertex);
		
		arr[fromIndex][toIndex] = weight;
		arr[toIndex][fromIndex] = weight;
 		
	}

	protected List<String> getAdjVertices(String fromVertex) 
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
	
	protected boolean exitEdges( String fromVertex, String toVertex )
	{
		int fromIndex = this.vertices.indexOf(fromVertex);
		int toIndex = this.vertices.indexOf(toVertex);
		
		return arr[fromIndex][toIndex] != MAX_WEIGHT;
	}

	public List<Edge> getAdjEdges() 
	{

		List<Edge> adjEdges = new ArrayList<Edge>();
		for( String vertex : vertices )
		{
			String fromVertex = vertex;
			for ( String vertex1 : vertices )
			{
				if ( !fromVertex.equals(vertex1) )
				{
					if ( exitEdges( fromVertex, vertex1 ) )
					{
						int fromIndex = this.vertices.indexOf(fromVertex);
						int toIndex = this.vertices.indexOf(vertex1);
						
						int weight = arr[fromIndex][toIndex];
						
						Edge edge = new Edge( fromVertex, vertex1, weight );
						adjEdges.add(edge);
					}
				}
			}
		}
		
		Collections.sort(adjEdges);
		
		for ( Edge edges : adjEdges )
		{
			System.out.println( "AdjEdges get0 :" + edges.toString() );
		}
		
		return adjEdges;
	}

}
