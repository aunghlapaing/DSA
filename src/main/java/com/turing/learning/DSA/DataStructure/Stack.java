package com.turing.learning.DSA.DataStructure;

public class Stack {

	int[] arr;
	public Stack(int size) {
		this.arr = new int[size];
	}

	int top = -1;
	public int push(int item) {
		
		return this.arr[++top] = item;	
	}

	public int size() {
		
		return top+1;
	}

	public int peek() {
		
		return this.arr[top];
	}

	public int pop() {
		
		return this.arr[top--];
		
	}

	public Boolean isEmpty() { 
		
		return this.top == -1;
	}
	
	

}
