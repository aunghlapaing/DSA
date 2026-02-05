package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAMatrix extends Graph {
	
	int[][] matrix;

	@Override
	void addVertices(String string) 
	{
		this.vertices.add(string);
		
	}

	@Override
	void build() 
	{
		int n = this.vertices.size();
		this.matrix = new int[n][n];
		
	}

	@Override
	void addEdges(String from, String to) 
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		if ( fromIndex != toIndex )
		{
			this.matrix[fromIndex][toIndex] = 1;
			this.matrix[toIndex][fromIndex] = 1;
		}	
		
	}

	@Override
	List<String> getAdjacentVertex(String from) 
	{
		List<String> list = new ArrayList<String>();
		for ( String vertex : this.vertices )
		{
			if ( !from.equals(vertex) )
			{
				if( this.exitEdge(from, vertex) )
				{
					list.add(vertex);
				}
			}
		}
		
		return list;
	}

	@Override
	boolean exitEdge(String from, String to) 
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		return this.matrix[fromIndex][toIndex] != 0; 
	}

}
