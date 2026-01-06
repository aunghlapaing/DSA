package com.turing.learning.DSA.GenericType;

import java.util.ArrayList;

public class GenericDataType {
	
	/*
	 * I want to out put the integer, string, double, and whatever I want.
	 * 
	 * */
	
	public static void main( String[] args)
	{
		Printer<String, Integer> print = new Printer<> ("John", 30);
		print.name();
		print.age();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		printList(list);
		
	}
	
	public static void printList(ArrayList<?> list)
	{
		System.out.println( "List :" + list );
	}

}
