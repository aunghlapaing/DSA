package com.turing.learning.DSA.Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	
	List<Integer> list = new ArrayList<Integer>();
	int n = list.size();

	public void insert(int item) 
	{
		this.list.add(item);
		this.heapify();
	}
	
	public Integer peek( )
	{
		return this.list.get(0);
	}
	
	List<Integer> setData( List<Integer> list )
	{
		this.list = list;
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

	public List<Integer> delete(int item) 
	{
		if ( !isLeaf(item) )
		{
			int deleteIndex = 0;
			// find item index and swap with leaf
			while ( deleteIndex < n )
			{
				if ( list.get(deleteIndex) == item )
				{
					
					break;
				}
				
				deleteIndex++;
			}
			
			// get deleteIndex and swap
			Integer temp = list.get(deleteIndex);
			Integer last = list.get(n);
			
			list.set(deleteIndex, last);
			list.set(n, temp);
		}
		// delete
		list.set(n, null);
		this.heapify();
		return list;
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
