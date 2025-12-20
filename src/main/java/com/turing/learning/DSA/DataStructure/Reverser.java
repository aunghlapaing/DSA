package com.turing.learning.DSA.DataStructure;

import java.util.Stack;

public class Reverser {

	public String reverse(String string) {
		
		Stack<Character> stack = new Stack<>();
		
		if ( string != null )
		{
			for ( int i = 0; i < string.length(); i++ )
			{
				stack.push(string.charAt(i));
			}
			
			String result = "";
			
			while ( !stack.isEmpty() )
			{
				result += stack.pop();
			}
			return result;
		}
		return null;
		
		
	}

}
