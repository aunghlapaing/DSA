package com.turing.learning.DSA.GenericType;

public class Printer <T, V> {
	
	T name;
	V age;
	
	Printer( T name, V age )
	{
		this.name = name;
		this.age = age;
	}
	public void name()
	{
		System.out.println("Name : " + name);
	}
	
	public void age()
	{
		System.out.println("Age : " + age);
	}
	
	

}
