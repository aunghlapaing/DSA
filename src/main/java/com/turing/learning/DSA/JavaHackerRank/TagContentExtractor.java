package com.turing.learning.DSA.JavaHackerRank;

import java.util.regex.*;

public class TagContentExtractor {

	public String validCheck(String input) 
	{
		String regex = "<(.+?)>([^<>]+)</\\1>"; // valid regex for html/xml
		Pattern p = Pattern.compile(regex);
		
		Matcher matcher = p.matcher(input);
		
		boolean status = false;
		
		while( matcher.find() )
		{
			status = true;
			return matcher.group(2);
			
		}
		if( !status )
		{
			return "None";
		}
		
		return null;
	}

}
