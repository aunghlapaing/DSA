package com.turing.learning.DSA.JavaHackerRank;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

	public String getCurrencyFormat(String string, double currency) 
	{
		String result = "";
		if ( string.equals("us") )
		{
			NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
			result = usFormat.format(currency);
			return result;
		}
		else if ( string.equals("india") )
		{
			NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
			result = indiaFormat.format(currency);
			return result;
		}
		return result;
		
	}

}
