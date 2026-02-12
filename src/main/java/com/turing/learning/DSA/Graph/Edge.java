package com.turing.learning.DSA.Graph;

public class Edge implements Comparable<Edge>{
	
	String from;
	String to;
	int weight;
	
	public Edge(String from, String to, int weight)
	{
		this.from = from;
		this.to = to;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge another) 
	{
		
		/*
		 * ==
		 * >
		 * <
		 */
		
		return Integer.compare(this.weight, another.weight);
	}

	@Override
	public String toString() 
	{
		return from + " - " + to + " = " + weight;
	}
	
	
	

}
