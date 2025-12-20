package com.turing.learning.DSA.DataStructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ReverserTest {
	Reverser reverser = new Reverser();
	
	@Test
	public void SingleWordCase()
	{
		String words = reverser.reverse("a");
		
		assertEquals( "a", words );
	}
	
	@Test
	public void MultipleWordCase() 
	{
		assertEquals( "olleh", reverser.reverse("hello"));
	}
	
	@Test
	public void nullCase()
	{
		assertEquals( null, reverser.reverse(null) );
	}

}
