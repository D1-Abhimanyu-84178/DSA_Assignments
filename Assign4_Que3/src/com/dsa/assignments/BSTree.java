package com.dsa.assignments;

import java.util.Scanner;

import com.sun.source.tree.Tree;

public class BSTree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	public BSTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		if(isEmpty())
			root = new Node(value);
		else
			addNode(root, value);
	}
	
	public void addNode(Node trav, int value) {
		if(value < trav.data) {
			// add value into left of current node
			if(trav.left == null) {
				trav.left = new Node(value);
				return;
			}
			else
				addNode(trav.left, value);
		}
		else {
			// add value into right of current node
			if(trav.right == null) {
				trav.right = new Node(value);
				return;
			}
			else
				addNode(trav.right, value);
		}
	}
	
	public void inOrder() {
		System.out.println("InOrder ::");
		inOrder(root);
		
	}
	public void inOrder(Node trav) {
		if(trav == null) {
			return;
		}
        inOrder(trav.left);
        System.out.print(" "+ trav.data);
        inOrder(trav.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		BSTree t = new BSTree();
        int choice = 0;
        
        
	    do {
	    	System.out.println("0. exit");
	    	System.out.println("1. add value");
	        System.out.println("2. Print tree");
	    	System.out.println("Enter your choice: ");
	    	choice = sc.nextInt();
	    	switch(choice) {
	    	case 0:
	    		break;
	    	case 1:
	    		System.out.println("Enter value: ");
	    	    t.addNode(sc.nextInt());
	    	    break;
	    	case 2:
	    		System.out.println("Tree...");
	    		t.inOrder();
	    		break;
	    	default:
	    		System.out.println("Invalid Choice");
	        		
	    	}
	    }while(choice != 0);
	}

}
