package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix {
	
	List<String> vertices = new ArrayList<String>();
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
	
	public boolean hasExit( String from, String to )
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
				// we will current and next
				// and we need check these vertices has exit?
				if ( hasExit( string, vertex ) )
				{
					list.add(vertex);
				}
			}
		}
		
		return list;
	}

}
