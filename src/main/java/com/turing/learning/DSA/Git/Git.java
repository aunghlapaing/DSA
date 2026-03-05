package com.turing.learning.DSA.Git;

public class Git {
	
	String name;
	Git nextGit;
	
	Git( String name )
	{
		this.name = name;
	}
	
	public static void print(Git git) 
	{
		Git newGit = git;
		newGit.nextGit = git;
		System.out.println("Git name :" + newGit.name);
		System.out.println( "Git's git : " + newGit.nextGit.name );
	}
	
	public static void main( String[] args )
	{
		Git git = new Git( "Git" );
		print(git);
		Git git1 = new Git ( "Git1" );
		print(git1);
	}

}
