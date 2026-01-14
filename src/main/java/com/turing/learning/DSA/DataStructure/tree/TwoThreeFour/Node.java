package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import java.util.ArrayList;

public class Node {
	
	Node parent;
	public Integer[] key = new Integer[3];	
	ArrayList<Node> child = new ArrayList<>();
	
	int treeType = 4; // 2 - 3 - 4
	public int noOfkey = 1; // 

}
