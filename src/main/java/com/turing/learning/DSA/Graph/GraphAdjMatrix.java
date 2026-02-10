package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix extends Graph {
	
	int matrix [][];
	
	public void addVertices(String string) 
	{
		this.vertices.add(string);
		
	}

	public void build() 
	{
		int n = this.vertices.size();
		this.matrix = new int [n][n];
		
	}

	public void addEdge(String from, String to) 
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		this.matrix [fromIndex][toIndex] = 1;
		this.matrix [toIndex][fromIndex] = 1;
		
	}
	
	public boolean exitEdge( String from, String to )
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		return this.matrix [fromIndex][toIndex] != 0;
	}

	public List<String> getAdjVertices(String string) 
	{
		List<String> list = new ArrayList<String>();
		
		for ( String vertex : this.vertices )
		{
			if ( !string.equals(vertex) )
			{
				// we will get next
				// and we need check these vertices exit edge?
				if ( exitEdge( string, vertex ) )
				{
					list.add(vertex);
				}
			}
		}
		
		return list;
	}

}
