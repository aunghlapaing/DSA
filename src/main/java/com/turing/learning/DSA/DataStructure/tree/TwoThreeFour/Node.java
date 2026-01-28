package com.turing.learning.DSA.DataStructure.tree.TwoThreeFour;

import java.util.ArrayList;

public class Node {

	public Node parent;
	
	public Node getParent() 
	{
		return parent;
	}

	public void setParent(Node parent) 
	{
		this.parent = parent;
	}

	public Integer[] keys = new Integer[3];
	public ArrayList<Node> child = new ArrayList<>();
	
	public static int ORDER = 4;
	public int noOfNode = 1;
	
	
	public Node insertTree(Node node, int item) 
	{
		if ( node.noOfNode != ORDER )
		{
			// valid insert
			return validInsert(node, item);
		}
		else
		{		
			// need to split
			// System.out.println("Current node is full.");
			if ( node.parent == null )
			{
				Node splitReturnParent = split(node);
				
				// find index and insert
				Node nodeToInsert = node.findIndexInsert( splitReturnParent, item );
				
				return insertTree( nodeToInsert, item );
			}
			else
			{
				// current node parent is not null;
				System.out.println("Current parent node is not null.");
				Node splitReturnParent = split(node);
				
				Node currentParent = node.getParent();
				
				Node nodeToInsert = null;
				
				if ( currentParent.noOfNode == 2 )
				{
					nodeToInsert = isCurrentParentTwoTree(node, item, splitReturnParent, currentParent);
					
				}
				else if ( currentParent.noOfNode == 3 )
				{
					nodeToInsert = isCurrentParentThreeTree(node, item, splitReturnParent, currentParent);
					
				}
				else if ( currentParent.noOfNode == 4 )
				{
					nodeToInsert = isCurrentParentFourTree(node, item, splitReturnParent, currentParent, nodeToInsert);
					
				}
				
				// insert
				return insertTree( nodeToInsert, item );
	
			}		
		}
	}

	public Node isCurrentParentFourTree(Node node, int item, Node splitReturnParent, Node currentParent, Node nodeToInsert) 
	{
		System.out.println("Current parent is four tree type.");
		
		// split currentParent
		Node splitReturnFourTreeParent = split( currentParent );
		
		if ( currentParent.getParent() == null )
		{
			splitReturnFourTreeParent = splitCurrentParentFourTree(node, item, splitReturnParent, currentParent, splitReturnFourTreeParent);
			
			nodeToInsert = findIndexInsert( splitReturnFourTreeParent, item );
		}
		else if ( currentParent.getParent() != null )
		{
			//System.out.println( "CurrentParent's parent is not null." ); 
			splitReturnFourTreeParent = splitCurrentParentFourTree(node, item, splitReturnParent, currentParent, splitReturnFourTreeParent);
			
			// get currentParent's parent
			Node root = currentParent.getParent();

			// insert splitReturnFourTreeParent into currentParent's parent
			while ( root != null )
			{	
				// find index to remove from parent
				int nodeToRemove = findCurrentIndexToRemoveFromParent( currentParent, item );
				
				if ( root.noOfNode == 2 )
				{
					Node existChild = root.child.get(nodeToRemove);
					while ( existChild.child.size() != 0 )
					{						
						// remove index child of the root
						root.child.remove(nodeToRemove);

						// set root as three tree
						root.setThreeTreeType(splitReturnFourTreeParent, root, nodeToRemove);
						
						if ( nodeToRemove == 0 )
						{
	
							// set child0 as three tree
							Node child0 = root.child.get(nodeToRemove);
							Node threeNodeParent = splitReturnFourTreeParent.child.get(nodeToRemove);

							child0.setThreeTreeType(threeNodeParent, child0, nodeToRemove);
					
							// set child1 as two tree
							
							// set child2 as two tree							
		
						}
						else if ( nodeToRemove == 1 )
						{
							// set child1 as three tree
							Node child1 = root.child.get(nodeToRemove);
							Node threeNodeParent = splitReturnFourTreeParent.child.get(nodeToRemove);

							child1.setThreeTreeType(threeNodeParent, child1, nodeToRemove);
						}	
						// set exist child as three tree 
						existChild = existChild.child.get(nodeToRemove);
					}
					
					// add splitReturnFourTreeParent into root
					root.insertTree( root, splitReturnFourTreeParent.keys[0] );				

					// find node to insert
					nodeToInsert = findIndexInsert( splitReturnFourTreeParent, item );
					
					
				}
				else if ( root.noOfNode == 3 )
				{
					// set root as four tree
					Node existChild = root.child.get(nodeToRemove);
					while ( existChild.child.size() != 0 )
					{						
						// remove index child of the root
						root.child.remove(nodeToRemove);

						// set root as three tree
						root.setThreeTreeType(splitReturnFourTreeParent, root, nodeToRemove);
						
						if ( nodeToRemove == 0 )
						{
	
							// set child0 as three tree
							Node child0 = root.child.get(nodeToRemove);
							Node threeNodeParent = splitReturnFourTreeParent.child.get(nodeToRemove);

							child0.setThreeTreeType(threeNodeParent, child0, nodeToRemove);
					
							// set child1 as two tree
							
							// set child2 as two tree							
		
						}
						else if ( nodeToRemove == 1 )
						{
							// set child1 as three tree
							Node child1 = root.child.get(nodeToRemove);
							Node threeNodeParent = splitReturnFourTreeParent.child.get(nodeToRemove);

							child1.setThreeTreeType(threeNodeParent, child1, nodeToRemove);
						}	
						else if ( nodeToRemove == 2 )
						{
							// set child2 as three tree
							Node child2 = root.child.get(nodeToRemove);
							Node threeNodeParent = splitReturnFourTreeParent.child.get(nodeToRemove);

							child2.setThreeTreeType(threeNodeParent, child2, nodeToRemove);
						}	
						// set exist child as three tree 
						existChild = existChild.child.get(nodeToRemove);
					}
					
					// add splitReturnFourTreeParent into root
					root.insertTree( root, splitReturnFourTreeParent.keys[0] );				

					// find node to insert
					nodeToInsert = findIndexInsert( splitReturnFourTreeParent, item );
				}
				else if( root.noOfNode == 4 )
				{
					// split root ( recursive )
					
				}
				
				// traverse root
				root = root.getParent();
		  	}
			
			return nodeToInsert;
		}
		
		return nodeToInsert;
	}

	public void setTwoTreeType(Node twoTreeNode0, Node node) 
	{
		Node child0 = twoTreeNode0.child.get(0);
		child0.setParent(node);
		node.child.add(child0);
		
		Node child1 = twoTreeNode0.child.get(1);
		child1.setParent(node);
		node.child.add(child1);
		
	}

	public Node splitCurrentParentFourTree(Node node, int item, Node splitReturnParent, Node currentParent, Node splitReturnFourTreeParent) 
	{
		// set Two Tree into child0 of the splitReturnParent
		Node child0Parent = splitReturnFourTreeParent.child.get(0);
		
		Node child0of0 = currentParent.child.get(0);
		child0of0.setParent(child0Parent);
		child0Parent.child.add(child0of0);
		
		Node child1of0 = currentParent.child.get(1);
		child1of0.setParent(child0Parent);
		child0Parent.child.add(child1of0);

		// set Two Tree into child1 of the splitReturnParent
		Node child1Parent = splitReturnFourTreeParent.child.get(1);
		
		Node child0of1 = currentParent.child.get(2);
		child0of1.setParent(child1Parent);
		child1Parent.child.add(child0of1);
		
		Node child1of1 = currentParent.child.get(3);
		child1of1.setParent(child1Parent);
		child1Parent.child.add(child1of1);
		
		// find the current index of the it parent
		int indexToRemove = findCurrentIndexToRemoveFromParent( node, item ); 

		System.out.println( "Check INDEX to remove is at : " + indexToRemove );
		
		// child0 of the splitReturnFourTreeParent is three tree
		if ( indexToRemove == 0 )
		{
			// remove from child0Parent if index is 0
			child0Parent.child.remove(indexToRemove);

			// add split return parent into child0.
			child0Parent.insertTree(child0Parent, splitReturnParent.keys[0]);
			
			System.out.println( "SplitReturnFourTree's child0 index 0 :" + child0Parent.keys[0]);

			// set three child into splitFourTreeParent.child0
			setThreeTreeType(splitReturnParent, child0Parent, indexToRemove);
			
			// find index to insert
			//nodeToInsert = this.findIndexInsert(splitReturnFourTreeParent, item);
			
		}
		// child1 of the splitReturnFourTreeParent is three tree
		else if ( indexToRemove == 1 )
		{
			child1Parent.child.remove(indexToRemove);
			
			child1Parent.insertTree(child1Parent, item);
			
			setThreeTreeType( splitReturnParent, child1Parent, indexToRemove );
			
			//nodeToInsert = this.findIndexInsert(splitReturnFourTreeParent, item);
		}
		return splitReturnFourTreeParent;
	}

	public Node isCurrentParentThreeTree(Node node, int item, Node splitReturnParent, Node currentParent) 
	{
		Node nodeToInsert;
		System.out.println("Current Parent is three tree.");
		
		System.out.println("Split return parent value: " + splitReturnParent.keys[0]);
		
		// find the current index of the it parent and remove
		int indexToRemove = findCurrentIndexToRemoveFromParent( node, item ); 
		currentParent.child.remove(indexToRemove);
		
		System.out.println("Index to remove :" + indexToRemove);
		
		// add split return parent into current parent.
		currentParent.insertTree(currentParent, splitReturnParent.keys[0]);
		
		System.out.println("Current Parent after split parent insert :" + currentParent.noOfNode);
		
		// re-arrange child currentParent as four tree type
		setFourTreeType( splitReturnParent, currentParent, indexToRemove );
		
		// find index to insert
		nodeToInsert = this.findIndexInsert(currentParent, item);
		return nodeToInsert;
	}

	public Node isCurrentParentTwoTree(Node node, int item, Node splitReturnParent, Node currentParent) 
	{
		Node nodeToInsert;
		// find the current index of the it parent and remove
		int indexToRemove = findCurrentIndexToRemoveFromParent( node, item ); 
		currentParent.child.remove(indexToRemove);
		
		System.out.println("Index to remove :" + indexToRemove);
		
		// add split return parent into current parent.
		currentParent.insertTree(currentParent, splitReturnParent.keys[0]);
		
		System.out.println("Current Parent after split parent insert :" + currentParent.noOfNode);
		
		// re-arrange child currentParent as three tree type
		setThreeTreeType(splitReturnParent, currentParent, indexToRemove);
		
		// find index to insert
		nodeToInsert = this.findIndexInsert(currentParent, item);
		return nodeToInsert;
	}

	public void setFourTreeType(Node splitReturnParent, Node currentParent, int indexToRemove) 
	{
		if ( indexToRemove == 2 )
		{
			Node child2 = splitReturnParent.child.get(0);
			child2.setParent(currentParent);
			currentParent.child.add(child2);
			
			Node child3 = splitReturnParent.child.get(1);
			child3.setParent(currentParent);
			currentParent.child.add(child3);
		}
		else if ( indexToRemove == 1 )
		{
			System.out.println( "INDEX to remove is " + indexToRemove );
			
			Node child1 = splitReturnParent.child.get(0);
			child1.setParent(currentParent);
			currentParent.child.add(child1);
			
			Node child2 = splitReturnParent.child.get(1);
			child2.setParent(currentParent);
			currentParent.child.add(child2);
			
			// re-arrange child start from index 1
			for ( int i = 1; i < currentParent.child.size()-1; i++ )
			{
				Node temp = currentParent.child.get(i);
				currentParent.child.set(i, currentParent.child.get(i+1));
				currentParent.child.set(i+1, temp);
			}
			System.out.println( " Current Child length " + currentParent.child.size() );
		}
		else if ( indexToRemove == 0 )
		{
			System.out.println( "Check INDEX to remove is at : " + indexToRemove );
			
			Node child0 = splitReturnParent.child.get(0);
			child0.setParent(currentParent);
			currentParent.child.add(child0);

			Node child1 = splitReturnParent.child.get(1);
			child1.setParent(currentParent);
			currentParent.child.add(child1);
			
			// re-arrange child position 
			for ( int i = 0;  i <= 1; i++ )
			{
				Node temp = currentParent.child.get(i);
				currentParent.child.set(i, currentParent.child.get(i+2));
				currentParent.child.set(i+2, temp);
			}
			
		}
	}

	public void setThreeTreeType(Node splitReturnParent, Node currentParent, int indexToRemove) 
	{	
		if ( indexToRemove == 1 )
		{
			Node child1 = splitReturnParent.child.get(0);
			child1.setParent(currentParent);
			currentParent.child.add(child1);
			
			Node child2 = splitReturnParent.child.get(1);
			child2.setParent(currentParent);
			currentParent.child.add(child2);
		}
		else if ( indexToRemove == 0 )
		{	
			if ( currentParent.child.size() == 3 )
			{
				Node child0 = splitReturnParent.child.get(0);
				child0.setParent(currentParent);
				currentParent.child.add(child0);
				
				Node child1 = splitReturnParent.child.get(1);
				child1.setParent(currentParent);
				currentParent.child.add(child1);
				
				Node child3 = splitReturnParent.child.get(2);
				child3.setParent(currentParent);
				currentParent.child.add(child3);
				
			}
			else 
			{
				Node child0 = splitReturnParent.child.get(0);
				child0.setParent(currentParent);
				currentParent.child.add(child0);
				
				Node child1 = splitReturnParent.child.get(1);
				child1.setParent(currentParent);
				currentParent.child.add(child1);
				
				// change child 0 and and currentParnet child 1
				for ( int i =0; i < currentParent.child.size()-1; i++ )
				{
					Node temp = currentParent.child.get(i);
					currentParent.child.set(i, currentParent.child.get(i+1));
					currentParent.child.set(i+1, temp);
				}
			}
			
		}
	}

	public int findCurrentIndexToRemoveFromParent(Node node, int item) 
	{
		Node currentParent = node.getParent();
				
		int index = 0;
		while ( currentParent.child != null )
		{	
			index = 0;
			while ( index != currentParent.keys.length && currentParent.keys[index] != null )
			{
				if ( currentParent.keys[index] > item )
				{
					break;
				}
				index++;
			}
			
			if ( currentParent.child.size() == 0 )
			{
				break;
			}
			else
			{
				currentParent = currentParent.child.get(index);
			}
		}
		
		System.out.println( "Index :" + index );
		return index;
	}


	public Node validInsert(Node node, int item) 
	{
		int index = 0;
		while ( index != node.keys.length && node.keys[index] != null   )
		{
			if ( node.keys[index] > item )
			{
				break;
			}
			index++;
		}
		for ( int i = node.keys.length - 1; i > index; i-- )
		{
			node.keys[i] = node.keys[i-1];
		}
		node.keys[index] = item;
		node.noOfNode++;
		return node;
	}


	public Node findIndexInsert(Node currentParent, int item) 
	{
		int index = 0;
		while ( currentParent.child != null )
		{	
			index = 0;
			while ( index != currentParent.keys.length && currentParent.keys[index] != null )
			{
				if ( currentParent.keys[index] > item )
				{
					break;
				}
				index++;
			}
			
			if ( currentParent.child.size() == 0 )
			{
				break;
			}
			else
			{
				currentParent = currentParent.child.get(index);
			}
		}
		
		System.out.println( "Index :" + index );
		return currentParent;
	}

	
	public Node split(Node current) 
	{
		Node currentParent = new Node();
		currentParent.insertTree(currentParent, current.keys[1]);
		
		Node child0 = new Node();
		child0.insertTree(child0,current.keys[0]);
		child0.setParent(currentParent);
		currentParent.child.add(child0);
		
		Node child1 = new Node();
		child1.insertTree(child1, current.keys[2]);
		child1.setParent(currentParent);
		currentParent.child.add(child1);
		
		return currentParent;
	}
}
