package com.dsa.Assignments;

import com.dsa.Assignments.BSTree.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			BSTree bst = new BSTree();
			
			bst.addNode(8);
			bst.addNode(3);
			bst.addNode(10);
			bst.addNode(6);
			bst.addNode(1);
			bst.addNode(14);
			bst.addNode(13);
			bst.addNode(7);
			bst.addNode(4);
 
          Node key =   bst.binarySearch(10);
          System.out.println(key.getData());
		}

	}
