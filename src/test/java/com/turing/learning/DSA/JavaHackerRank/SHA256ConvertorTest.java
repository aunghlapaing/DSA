package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SHA256ConvertorTest {
	
	SHA256 solution = new SHA256();
	
	@Test
	public void onlyStringCase()
	{
		String input = "JavaSHA";
		
		String result = solution.convert( input );
		
		assertEquals( "f6474550c73436d3f93835aaec648d713f71630382def616d3c131977800b394", result );  
		
	}
	
	@Test
	public void stringDigitCase()
	{
		String input = "JavaSHA-256";
		
		String result = solution.convert( input );
		
		assertEquals( "13936db06fa460dc53c02d8f9be04ce04ec30b728739d00156652a0140f3ecb8", result );
	}

}
