package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SHA256ConvertorTest {
	
	@Test
	public void onlyStringCase()
	{
		SHA256 solution = new SHA256();
		
		String input = "JavaSHA";
		
		String result = solution.convert( input );
		
		assertEquals( "f6474550c73436d3f93835aaec648d713f71630382def616d3c131977800b394", result );  
		
	}

}
