package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class Graph {

	List<String> vertices = new ArrayList<String>();
	
	abstract void addVertices(String string);
	abstract void build();
	abstract void addEdges(String from, String to);
	abstract List<String> getAdjacentVertex( String from );
	abstract boolean exitEdge( String from, String to );
	
	public List<String> dfs() 
	{
		List<String> visited = new ArrayList<String>();
		
		// start from root
		String firstVertex = this.vertices.get(0);
		Stack<String> stack = new Stack<>();
		
		stack.push(firstVertex);
		
		while ( !stack.isEmpty() )
		{
			String vertex = stack.pop();
			if ( !visited.contains(vertex) )
			{
				visited.add(vertex);
			}
	
			List<String> adjVertices = this.getAdjacentVertex(vertex);
			int n = adjVertices.size();
			
			for ( int i = n - 1; i >= 0; i-- )
			{
				String adjVertex = adjVertices.get(i);
				if ( !visited.contains(adjVertex) )
				{
					stack.push(adjVertex);
				}		
			}	
			
		}
		
		return visited;
	}

}
