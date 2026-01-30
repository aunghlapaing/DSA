package com.turing.learning.DSA.hash;

import java.util.LinkedList;

public class HashTableWithChaining {
	
	LinkedList[] arr = new LinkedList[10];
	
	public HashTableWithChaining()
	{
		for ( int i = 0; i < arr.length; i++)
		{
			arr[i] = new LinkedList<String>();
		}
	}

	
	public static int hash( String word, int bucketSize )
	{
		int count = 0;
		for ( int i = 0; i < word.length(); i++)
		{
			count += word.codePointAt(i);
		}
		return count % bucketSize;
	}

	public void insert(String word) 
	{
		int index = HashTableWithChaining.hash(word, arr.length );
		@SuppressWarnings("unchecked")
		LinkedList<String> list = arr[index];
		list.add(word);		
	}
	
	public boolean isContain(String word)
	{
		int index = HashTableWithChaining.hash(word, arr.length);
		@SuppressWarnings("unchecked")
		LinkedList<String> list = arr[index];
		return list.contains(word);
	}

}
