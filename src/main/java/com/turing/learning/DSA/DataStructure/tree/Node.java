package com.turing.learning.DSA.DataStructure.tree;

public class Node {
	
	int value;
	Node leftChild;
	Node rightChild;
	
	public Node( int node )
	{
		this.value = node;
	}
	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}


	public Node getRightChild() {
		return rightChild;
	}


	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

}
