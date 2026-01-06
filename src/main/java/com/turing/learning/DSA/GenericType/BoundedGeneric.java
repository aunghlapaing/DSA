package com.turing.learning.DSA.GenericType;

public class BoundedGeneric< T extends Animal>  {
	
	T thingsToGet;
	
	public BoundedGeneric( T thingsToget )
	{
		this.thingsToGet = thingsToget;
	}
	
	public void print()
	{
		System.out.println( "Cat :" + thingsToGet);
	}

}
