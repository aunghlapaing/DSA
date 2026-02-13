package com.turing.learning.DSA.Graph;

public class Edge implements Comparable<Edge>{
	
	String fromVertex;
	String toVertex;
	int weight;
	
	public Edge(String from, String to, int weight)
	{
		this.fromVertex = from;
		this.toVertex = to;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge another) 
	{
		return Integer.compare(this.weight, another.weight);
	}

	@Override
	public String toString() 
	{
		return fromVertex + " - " + toVertex + " = " + weight;
	}
}
