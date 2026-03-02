package com.turing.learning.DSA.HackerRank.OOP;

public class MyBook extends Book {
	int price;
	
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}


	@Override
	String display() 
	{
		System.out.print( "Title : " + super.title + "\n" + "Author : " + super.author + "\n" + "Price : " + this.price);
		return "Let's get abstract.";
	}

}
