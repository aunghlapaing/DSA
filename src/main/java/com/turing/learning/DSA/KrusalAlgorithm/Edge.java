package com.turing.learning.DSA.KrusalAlgorithm;

public class Edge implements Comparable<Edge> {

	String fromVertex;
	String toVertex;
	int weight;
	
	public Edge( String fromVertex, String toVertex, int weight )
	{
		this.fromVertex = fromVertex;
		this.toVertex = toVertex;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge other) {
		
		return Integer.compare(this.weight, other.weight);
	}
	
	@Override
	public String toString() {
		return fromVertex + "-" + toVertex + "=" + weight;
	}


}
