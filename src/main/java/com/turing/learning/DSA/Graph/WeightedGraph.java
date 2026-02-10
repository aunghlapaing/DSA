package com.turing.learning.DSA.Graph;

public class WeightedGraph extends GraphAdjMatrix {
	
	int MAX_WEIGHT = Integer.MAX_VALUE;
	
	public void build() 
	{
		int n = this.vertices.size();
		this.matrix = new int [n][n];
		
		for ( int i = 0; i < n; i++ )
		{
			for ( int j = 0; j < n; j++ )
			{
				this.matrix[i][j] = MAX_WEIGHT;
			}
		}
		
	}
	
	public void addEdge(String from, String to, int weight) 
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		this.matrix [fromIndex][toIndex] = weight;
		this.matrix [toIndex][fromIndex] = weight;
		
	}
	
	public boolean exitEdge( String from, String to )
	{
		int fromIndex = this.vertices.indexOf(from);
		int toIndex = this.vertices.indexOf(to);
		
		return this.matrix [fromIndex][toIndex] != MAX_WEIGHT;
	}
	

}
