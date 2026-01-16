package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import java.util.ArrayList;

public class Node {
	
	Node parent;
	Integer[] keys = new Integer[3];

	ArrayList<Node> child = new ArrayList<>();
	
	int order = 4; // to compare with noOfNode to know tree type;
	int noOfNode = 1; // will increase into 2-3 later
	

}
