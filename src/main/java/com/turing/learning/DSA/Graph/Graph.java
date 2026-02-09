package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class Graph {
	List<String> vertices = new ArrayList<String>();
	
	abstract void addVertices( String string );
	abstract void build();
	abstract void addEdge( String form, String to );
	abstract List<String> getAdjVertices(String string);
	
	public List<String> dfs() 
	{
		List<String> visited = new ArrayList<String>();
		
		String currentVertex = this.vertices.get(0);
		Stack<String> stack = new Stack<String>();
		stack.push(currentVertex);
		
		while ( !stack.isEmpty() )
		{
			String vertex = stack.pop();
			if ( !visited.contains(vertex) )
			{
				visited.add(vertex);
			}
			
			
			List<String> adjVertices = this.getAdjVertices(vertex);
			if ( adjVertices.size() > 0 )
			{
				for ( int i = adjVertices.size() - 1; i >= 0; i-- )
				{
					vertex = adjVertices.get(i);
					if ( !visited.contains(vertex) )
					{
						System.out.println(" Vertex :" + vertex );
						stack.push(vertex);
					}					
				}
			}
		}
		
		return visited;
	}

}
