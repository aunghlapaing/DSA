package com.turing.learning.DSA.JavaHackerRank;

public class BinaryToDecimal implements Convertor {

	@Override
	public String convert(String input) 
	{
		int decimal = 0;
		int n = input.length() - 1;
		
		for( int i = 0; i < input.length(); i++ )
		{
			int oneBinary = input.charAt(i)-'0';
			decimal += oneBinary * (int)Math.pow(2, n);
			n--;
		}
		String result = String.valueOf(decimal);
		return result;
	}

}
