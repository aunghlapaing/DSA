package com.turing.learning.DSA.DataStructure.tree;

public class Node {
	
	int value;
	Node parent;
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
	
	public Node getParent() {
		return parent;
	}


	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(Node leftChild) {
		leftChild.setParent(this);
		this.leftChild = leftChild;
	}


	public Node getRightChild() {
		return rightChild;
	}


	public void setRightChild(Node rightChild) {
		rightChild.setParent(this);
		this.rightChild = rightChild;
	}

}
