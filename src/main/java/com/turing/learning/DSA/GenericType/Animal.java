package com.turing.learning.DSA.GenericType;

public class Animal {
	static String cat;
	
	public Animal()
	{
		
	}
	public Animal(String cat)
	{
		Animal.cat = cat;
		
	}
	
	public static void getAnimal(String cat)
	{
		System.out.println( "Cat :" + cat );
		
	}
	
	public void getAnimal()
	{
		System.out.println( "Cat :" + cat );
		
	}
	
	



}
