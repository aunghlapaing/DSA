package com.turing.learning.DSA.Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	
	List<Integer> list = new ArrayList<Integer>();

	public void insert(int item) 
	{
		this.list.add(item);
		this.heapify();
	}
	
	public Integer peek( )
	{
		return this.list.get(0);
	}
	
	List<Integer> setData( List<Integer> data )
	{
		//this.list = data;
		for ( Integer item : data )
		{
			this.list.add(item);
		}
		this.heapify();
		return list;
	}
	

	public void heapify() 
	{
		int currentIndex = ( list.size()/2 ) - 1;
		while ( currentIndex >= 0 ) 
		{
			int n = list.size();
			int largestIndex = ( n / 2) - 1;
			int leftIndex = ( largestIndex * 2 ) + 1;
			int rightIndex = ( largestIndex * 2 ) + 2;
			if ( leftIndex < n )
			{
				if ( list.get(leftIndex) > list.get(largestIndex) )
				{
					largestIndex = leftIndex;
				}
			}
			if ( rightIndex < n )
			{
				if ( list.get(rightIndex) > list.get(largestIndex) )
				{
					largestIndex = rightIndex;
				}
			}
			// swap
			Integer temp = list.get(largestIndex);
			Integer max = list.get(largestIndex);
			
			list.set(currentIndex, max);
			list.set(largestIndex, temp);
			
			currentIndex--;
		}
	}

	public ArrayList<Integer> delete(int item) 
	{
		int n = list.size();
		System.out.println( "Last :" + list.get(n - 1) );
		int deleteIndex = 0;
		if ( !isLeaf(item) )
		{
			// find item index and swap with leaf
			while ( deleteIndex < n - 1 )
			{
				if ( list.get(deleteIndex) == item )
				{
					break;
				}
				deleteIndex++;
			}
			System.out.println( "DeleteIndex:" + deleteIndex);
			// get deleteIndex and swap
			Integer temp = list.get(deleteIndex);
			Integer last = list.get(n -1);
			
			list.set(deleteIndex, last);
			list.set(n - 1, temp);
		}
		// delete
		this.list.remove(deleteIndex);
		this.heapify();
		return new ArrayList<>(list);
	}

	private boolean isLeaf(int item) 
	{
		int lastIndex = list.size()-1;
		if ( list.get(lastIndex) == item )
		{
			return true;
		}
		return false;
	}
}
