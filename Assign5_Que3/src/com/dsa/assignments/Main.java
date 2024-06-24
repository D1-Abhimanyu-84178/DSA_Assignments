package com.dsa.assignments;

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
 
			bst.inorder();
			bst.deleteNode(10);
			bst.inorder();
		}

	}
