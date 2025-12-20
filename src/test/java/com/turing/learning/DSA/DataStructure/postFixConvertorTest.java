package com.turing.learning.DSA.DataStructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class postFixConvertorTest {
	
	postFixConvertor postFix = new postFixConvertor();
	
	@Test
	public void simpleCase()
	{
		assertEquals("ab+", postFix.convertor("a+b"));
	}
	
	@Test
	public void twoOperatorsCase()
	{
		String result = postFix.convertor("a*b+c");
		assertEquals( "ab*c+", result );
	}
	
	@Test
	public void threeOperatorCase()
	{
		String result = postFix.convertor("a+b*c-d");
		assertEquals("abc*+d-", result);
	}
	
	@Test
	public void testWithParenthesisCase()
	{
		String result = postFix.convertor("(a+b)*c");
		assertEquals( "ab+c*", result );
	}

}
