package com.turing.learning.DSA.JavaHackerRank;

public class StringSplitRegex {

	public String[] splitToken(String input) {
		
		
		String[] result = input.split("[^a-zA-Z0-9]+");
		
		return result;
	}

}
