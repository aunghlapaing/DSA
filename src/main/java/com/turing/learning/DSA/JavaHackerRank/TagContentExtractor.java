package com.turing.learning.DSA.JavaHackerRank;

import java.util.regex.*;
import java.util.*;

public class TagContentExtractor {

	public List<String> validCheck(String input) 
	{
		List<String> result = new ArrayList<String>();
		
		String regex = "<(.+?)>([^<>]+)</\\1>"; // valid regex for html/xml
		Pattern p = Pattern.compile(regex);
		
		Matcher matcher = p.matcher(input);
		
		while( matcher.find() )
		{
			result.add(matcher.group(2));	
		}
		return result;
	}

}
