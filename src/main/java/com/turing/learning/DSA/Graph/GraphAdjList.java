package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjList extends Graph {
	
	List<List<String>> adjList = new ArrayList<List<String>>();
	
	/*
	 * [
	 *  [ ]
	 * ]
	 * 
	 * */

	@Override
	void addVertices(String string) 
	{
		this.vertices.add(string);
	}

	@Override
	void build() 
	{
		for ( int i = 0; i < vertices.size(); i++ )
		{
			List<String> list = new ArrayList<>();
			this.adjList.add(list);
		}
		
	}

	@Override
	void addEdges(String from, String to) 
	{
		int fromIndex = this.vertices.indexOf(from);
		List<String> fromAdjVertex = this.adjList.get(fromIndex);
		fromAdjVertex.add(to);

		int toIndex = this.vertices.indexOf(to);
		List<String> toAdjVertex =  this.adjList.get(toIndex);
		toAdjVertex.add(from);	
	}

	@Override
	List<String> getAdjacentVertex(String from) 
	{
		List<String> list = new ArrayList<String>();
		
		for ( String vertex : this.vertices )
		{
			if ( !from.equals(vertex) )
			{
				if ( exitEdge( from, vertex ) )
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
		List<String> fromAdjVertex = this.adjList.get(fromIndex);
		return fromAdjVertex.contains(to);
	}

}
