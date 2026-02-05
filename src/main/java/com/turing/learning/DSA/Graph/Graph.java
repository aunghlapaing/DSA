package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
		
		// start from first index of the vertices
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
	
	public List<String> bfs() 
	{
		List<String> visited = new ArrayList<String>();
		
		// start from first index of the vertices
		String firstVertex = this.vertices.get(0);
		Queue<String> queue = new LinkedList<String>();
		
		queue.add(firstVertex);
		
		while ( !queue.isEmpty() )
		{
			String vertex = queue.poll();
			if ( !visited.contains(vertex) )
			{
				visited.add(vertex);
			}
			
			List<String> adjVertices = this.getAdjacentVertex(vertex);
			for ( String adjVertex : adjVertices )
			{
				if ( !visited.contains(adjVertex) )
				{
					queue.add(adjVertex);
				}
			}
		}

		return visited;
	}

}
