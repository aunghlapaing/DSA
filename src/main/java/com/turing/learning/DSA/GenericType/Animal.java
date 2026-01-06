package com.turing.learning.DSA.GenericType;

public class Animal {
	String cat;
	String dog;
	
	public Animal()
	{
		
	}
	public Animal(String cat, String dog)
	{
		this.cat = cat;
		this.dog = dog;
	}
	
	public void getAnimal()
	{
		System.out.println( "Cat :" + cat );
		System.out.println( "Cat :" + dog );
	}


}
