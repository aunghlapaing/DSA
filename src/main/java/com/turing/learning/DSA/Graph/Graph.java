package com.turing.learning.DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public abstract class Graph {

	List<String> vertices = new ArrayList<String>();
	
	abstract void addVertices(String string);
	abstract void build();
	abstract void addEdges(String from, String to);
	abstract List<String> getAdjacentVertex( String from );
	abstract boolean exitEdge( String from, String to );

}
