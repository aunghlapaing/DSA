package com.turing.learning.DSA.testing;

import java.util.Arrays;

public class Capital {

	public String toCapital(String string) {
		
		if ( !" ".equals(string) || string != null )
		{
			String words[] = string.split(" ");
			
			String result = "";
			for (String w : words)
			{
				result += toCapitalSingleWord(w) + " ";
				System.out.println(Arrays.toString(words));
			}
			return result.trim();
		}
		else 
		{
			return "";
		}
	}

	private String toCapitalSingleWord(String string) {
		String uppserCase = (string.charAt(0)+"").toUpperCase() + string.substring(1);
		return uppserCase;
	}
	
	public static void main(String[]args)
	{
		Capital cap = new Capital();
		
		String output = cap.toCapital("apple orange");
		
		System.out.println("output : " + output);

	}

}
