package com.turing.learning.DSA.Git;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GitTest {
	
	@Test
	public void referenceTypeCase()
	{
		Git git = new Git("new Git");
		Git newGit = git.print(git);
		
		assertEquals( "new Git", newGit.nextGit.name );
	}

}
