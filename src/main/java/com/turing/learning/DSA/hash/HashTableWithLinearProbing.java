package com.turing.learning.DSA.hash;

import java.util.ArrayList;

public class HashTableWithLinearProbing implements HashTable {
	
	ArrayList<String> list = new ArrayList<>();

	@Override
	public void insert(String word) 
	{
		int index = this.hash(word);
		
		
	}
	
	public boolean isContain( int index )
	{
		String data = list.get(index);
		
		return data != null;
	}
	
	public int hash( String word )
	{
		int count = 0;	
		return count++;
	}

}
