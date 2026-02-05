package com.turing.learning.DSA.Graph;

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
		this.matrix[n][n] = 0;
		
	}

	@Override
	void addEdges(String from, String to) 
	{
		
		
	}

}
