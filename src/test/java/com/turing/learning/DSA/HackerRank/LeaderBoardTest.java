package com.turing.learning.DSA.HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class LeaderBoardTest {
	
	LeaderBoard solution = new LeaderBoard();
	
	@Test
	public void simpleCase()
	{
		
		
		List<Integer> rank = new ArrayList<Integer>();
		List<Integer> playerMark = new ArrayList<Integer>();
		
		rank.add(100);
		rank.add(50);
		
		playerMark.add(5);
		playerMark.add(25);
		playerMark.add(120); // go to the left
		
		List<Integer> boardResult = solution.scoreBoard( rank, playerMark );
		
		assertEquals( 3, boardResult.get(0) );
		assertEquals( 3, boardResult.get(1) );
		assertEquals( 1, boardResult.get(2) );
		
	}
	

}
