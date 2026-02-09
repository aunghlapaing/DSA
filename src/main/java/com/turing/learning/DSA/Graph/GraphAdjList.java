package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjList extends Graph {
	
	
	List<List<String>> adjList = new ArrayList<>();
	
	public void addVertices(String vertex) 
	{
		this.vertices.add(vertex);
		
	}

	public void build() 
	{
		for ( int i = 0; i < vertices.size(); i++ )
		{
			List<String> list = new ArrayList<String>();
			this.adjList.add(list);
		}		
	}

	public void addEdge(String from, String to) 
	{
		int fromIndex = this.vertices.indexOf(from);
		List<String> fromVertex = this.adjList.get(fromIndex);
		fromVertex.add(to);
		
		int toIndex = this.vertices.indexOf(to);	
		List<String> toVertex = this.adjList.get(toIndex);
		toVertex.add(from);
	}

	public List<String> getAdjVertices(String string) 
	{
		int index = this.vertices.indexOf(string);
		List<String> list = this.adjList.get(index);
		return list;
	}

}
