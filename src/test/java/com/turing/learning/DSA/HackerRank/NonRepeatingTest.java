package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NonRepeatingTest {
	
	@Test
	public void singleCharacterCase()
	{
		NonRepeating repeat = new NonRepeating();
		int result = repeat.nonRepeatingCharacter("A");
		assertEquals( 0, result );
	}
	@Test
	public void multipleCharacterCase()
	{
		NonRepeating repeat = new NonRepeating();
		int result = repeat.nonRepeatingCharacter("aabb");
		assertEquals( -1, result );
	}
	
	@Test
	public void multiplePositiveCharacterCase()
	{
		NonRepeating repeat = new NonRepeating();
		int result = repeat.nonRepeatingCharacter("leetcode");
		assertEquals( 0, result );
	}
	
	@Test
	public void nullCharacterCase()
	{
		NonRepeating repeat = new NonRepeating();
		int result = repeat.nonRepeatingCharacter("");
		assertEquals( -1, result );
	}
	

}
