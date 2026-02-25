package com.turing.learning.DSA.HackerRank;

import java.util.ArrayList;
import java.util.Stack;

public class Delimiter {

	ArrayList<Character> startTag = new ArrayList<>();
	ArrayList<Character> endTag = new ArrayList<>();

	public Delimiter()
	{
		startTag.add('(');
		startTag.add('[');
		startTag.add('{');
		
		endTag.add(')');
		endTag.add(']');
		endTag.add('}');
	}
	
	public void isValid(String string) 
	{
		Stack<Character> stack = new Stack<Character>();
		for ( int i = 0; i < string.length(); i++ )
		{
			char ch = string.charAt(i);
			if ( startTag.contains(ch) )
			{
				stack.push(ch);
			}
			else if ( endTag.contains(ch) )
			{
				if ( stack.isEmpty() )
				{
					stack.push(ch);
					break;
				}
				else 
				{
					char ch1 = stack.pop();
					int startIndex = startTag.indexOf(ch1);
					int endIndex = endTag.indexOf(ch);
					if ( startIndex != endIndex )
					{
						break;
					}
				}
			}
		}
		if ( stack.isEmpty() )
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	public static void main( String[] args )
	{
		Delimiter delimiter = new Delimiter();
		delimiter.isValid("(({()})))");
	}

}
