package com.turing.learning.DSA.JavaHackerRank;

import java.security.MessageDigest;

public class SHA256 {

	public String convert(String input) 
	{
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256"); // SHA-256
			byte[] hash = md.digest(input.getBytes("UTF-8"));
			
			StringBuilder hexString = new StringBuilder();
			
			for( int i = 0; i < hash.length; i++ )
			{
				String hex = Integer.toHexString(0xff & hash[i]);
				
				if( hex.length() == 1 )
				{
					hexString.append("0");
				}
				hexString.append(hex);
			}
			
			return hexString.toString();
			
		}
		catch( Exception e )
		{
			throw new RuntimeException( "NO Such Hashing Algorithm!" );
		}

	}
	
}
