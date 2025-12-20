package com.turing.learning.DSA.DataStructure;

import java.util.HashMap;
import java.util.Stack;

public class postFixConvertor {
	
	HashMap<Character, Integer> precedences = new HashMap<>();
	
	public postFixConvertor()
	{
		this.precedences.put('+', 1);
		this.precedences.put('-', 1);
		
		this.precedences.put('*', 2);
		this.precedences.put('/', 2);
	}
	
	public boolean isHigherOrEqual(Character firstPrecedence, Character secPrecedence) 
	{
		int firstOperator = this.precedences.get(firstPrecedence);
		int secOperator = this.precedences.get(secPrecedence);
		
		return firstOperator >= secOperator;
	}
	
	public boolean isParanthesis( char ch )
	{
		return ch == '(' || ch == ')';
	}
	
	public boolean isOperator( char ch )
	{
		return ch == '+' || ch == '-' || ch == '*' || ch == '/' ;
	}
	
	public boolean isOperand ( char ch )
	{
		return !this.isOperator(ch) && !this.isParanthesis(ch);
	}

	public String convertor(String string) {
		
		Stack<Character> stack = new Stack<>();
		
		String postFix = "";
		
		for ( int i = 0; i < string.length(); i++ )
		{
			Character ch = string.charAt(i);
			if ( this.isOperand(ch) )
			{
				postFix += ch;
			}
			else if ( ch == '(' )
			{
				stack.push(ch);
			}
			else if ( ch == ')' )
			{
				while ( !stack.isEmpty() && stack.peek() != '(' )
				{
					postFix += stack.pop();
				}
				if ( !stack.isEmpty() ) // stack is not empty because is still have '('
				{
					stack.pop();
				}
			}
			else if ( this.isOperator(ch) )
			{
				if ( stack.isEmpty() )
				{
					stack.push(ch);
				}
				else 
				{
					while ( !stack.isEmpty() && stack.peek() != '(' && this.isHigherOrEqual(stack.peek(), ch))
					{
						postFix += stack.pop();
					}
					if ( !stack.isEmpty() )
					{
						stack.push(ch);
					}
					else
					{
						stack.push(ch);
					}
				}	
			}	
		}
		
		while ( !stack.isEmpty() )
		{
			postFix += stack.pop();
		}

		return postFix;
	}
}
