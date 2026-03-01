package com.turing.learning.DSA.HackerRank.OOP;

public class Grade {
	
	protected String name;
	protected int id;
	
	Grade(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public void display()
	{
		System.out.println( "Name :" + name + " " + "ID : " + id );
	}

}
