package com.turing.learning.DSA.Git;

public class Git {
	
	String name;
	Git nextGit;
	
	Git( String name )
	{
		this.name = name;
	}
	
	public Git print(Git git) 
	{
		Git newGit = git;
		newGit.nextGit = git;
		System.out.println("Git name :" + newGit.name);
		System.out.println( "Git's git : " + newGit.nextGit.name );
		return newGit;
		
	}

}
