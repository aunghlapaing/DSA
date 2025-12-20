package com.turing.learning.DSA.DataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class Delimiter {
	
	ArrayList<Character> startTag = new ArrayList<>();
	ArrayList<Character> endTag = new ArrayList<>();

	public Delimiter()
	{
		startTag.add('[');
		startTag.add('{');
		
		endTag.add(']');
		endTag.add('}');
	}

	public Boolean isValid(String string) {
		
		Stack<Character> stack = new Stack<>();
		for ( int i = 0; i < string.length(); i++ )
		{
			//push case
			Character ch = string.charAt(i);
			if ( startTag.contains(ch) )
			{
				stack.push(ch);
			}
			else if ( endTag.contains(ch) )
			{
				// stack contain endTag but stack is empty
				if ( stack.isEmpty() )
				{
					return false;
				}
				if (!isBalanced(stack, ch))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private boolean isBalanced(Stack<Character> stack, Character ch) {
		Character topElementIndex = stack.pop(); // startTag [ which is pop element
		int endTagIndex = endTag.indexOf(ch);
		int startTagIndex = startTag.indexOf(topElementIndex);
		if ( endTagIndex != startTagIndex )
		{
			return false;
		}
		return true;
	}

}
