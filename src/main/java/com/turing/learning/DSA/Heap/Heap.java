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
			int leftIndex = ( currentIndex * 2 ) + 1;
			int rightIndex = ( currentIndex * 2 ) + 2;
			if ( leftIndex < n && list.get(leftIndex) > list.get(largestIndex))
			{
				largestIndex = leftIndex;	
			}
			if ( rightIndex < n && list.get(rightIndex) > list.get(largestIndex) )
			{
				largestIndex = rightIndex;
			}
			// swap
			Integer temp = list.get(currentIndex);
			Integer max = list.get(largestIndex);
			
			list.set(currentIndex, max);
			list.set(largestIndex, temp);
			
			currentIndex--;
		}
	}

	public ArrayList<Integer> delete(Integer item) 
	{	
		int n = list.size();
		int deleteIndex = this.list.indexOf(item);
		
		System.out.println( "DeleteIndex : " + list.indexOf(item) );
		if ( deleteIndex != -1 )
		{
			if ( !isLeaf(item) )
			{
				//  swap with leaf
				Integer temp = list.get(deleteIndex);
				Integer last = list.get(n -1);
				
				list.set(deleteIndex, last); // (index, value)
				list.set(n - 1, temp);
			}
			// delete
			this.list.remove(n-1);
			this.heapify();
			//System.out.println( "After Delete List :" + list.toString());
			return new ArrayList<>(list);
		}
		else
		{
			throw new RuntimeException( "Delete Item not found." );
		}
	}

	private boolean isLeaf(int item) 
	{
		int lastIndex = list.size()-1;
		return list.get(lastIndex) == item;
	}
}
