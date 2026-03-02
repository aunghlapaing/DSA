package com.turing.learning.DSA.HackerRank.OOP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class BookAbstractTest {
	
	
	@Test
	public void abstractCase()
	{
		Scanner sc = new Scanner( System.in );
		System.out.println( "Enter Title :" );
		String title = sc.nextLine();
		
		System.out.println( "Enter Author :" );
		String author = sc.nextLine();
		
		System.out.println( "Enter Price :" );
		int price = sc.nextInt();
		
		Book myBook = new MyBook( title, author, price );
		String result = myBook.display();
		assertEquals( "Let's get abstract." , result );
		sc.close();
	}

}
