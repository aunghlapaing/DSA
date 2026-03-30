package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CurrencyFormatterTest {
	
	@Test
	public void usCurrencyFormatCase()
	{
		CurrencyFormatter format = new CurrencyFormatter();
		
		double currency = 12324.134;
		String usFormat = "us";
		
		assertEquals( "$12,324.13", format.getCurrencyFormat( usFormat , currency ) );
	}
	
	@Test
	public void indiaCurrencyFormatCase()
	{
		CurrencyFormatter format = new CurrencyFormatter();
		
		double currency = 12324.134;
		String indiaFormat = "india";
		
		assertEquals( "₹12,324.13", format.getCurrencyFormat( indiaFormat, currency ) );
	}

}
