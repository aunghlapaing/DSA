package com.turing.learning.DSA.HackerRank.OOP;

public class Test implements TestInterface {
	
	/*
	 * Inherit
	public void getPrint()
	{
		super.print();
	}
	*/
	
	/*
	 * Abstract
	@Override
	void print() 
	{
		System.out.println("Hello World");
		
	}
	*/
	
	@Override
	public void print() 
	{
		System.out.println( "Hello World" );
		
	}
	
	public static void main( String[] args )
	{
		// Test test = new Test();
		// TestAbstract test = new Test();
		TestInterface test = new Test();
		test.print();
	}

	

	

}
