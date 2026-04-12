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
	
	@Test
	public void mixedInputCase()
	{
		String input = "K1t4fo0V";
		
		String result = solution.convert(input);
		
		assertEquals( "0a979e43f4874eb24b740c0157994e34636eed0425688161cc58e8b26b1dcf4e", result );
	}

}
