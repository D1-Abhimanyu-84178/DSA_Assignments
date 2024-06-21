package com.sunbeam.SinglyCircular;

public class List {

	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
//	private Node head;
	private Node tail;
	private int count;
	
	public List() {
		tail = null;
		count = 0;
	}
	
	public void display() {
		//if list is empty
	  if(isEmpty()) {
		  return; 
	  }
	  Node trav = tail.next;
	  System.out.println("List : ");
	  do {
		  System.out.print(" " + trav.data);
		  trav = trav.next;
	  }while(trav != tail.next);
	  System.out.println("");
	  System.out.println("Node Count : " + count);
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;	
			//make list circular
			newnode.next = newnode;
		}
		else {
			//a. add newnode into tail.next 
			newnode.next = tail.next;
			//b. add new into next of lastnode
			tail.next = newnode;			
		}	
		
		count++;
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			//make it circular
			newnode.next = newnode;
		}
		
		else {
			//a. add first node into next of newnode
		   newnode.next = tail.next;
		   //b. add newnode into next of last node
	       tail.next = newnode;
	       //c. move tail on newnode
	       tail = newnode;
		}
		count++;
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(tail.next == null) {
			tail = null;
		}
		else {
			tail.next = tail.next.next;
		}
		count--;
	}
	
	public void deleteLast() {
		if(isEmpty()) {
			return;
		}
		else if(tail.next == tail) {
			tail = null;
		}
		else {
			Node trav = tail.next;
		    while(trav.next != tail) { //when trav arrives at second last terminate the loop
		    	trav = trav.next;      // so trav is right now at second last position
		    }
		    trav.next = tail.next;    // assign the first element to the second last element
		    tail = trav;              // then move to trav(second last)
		}
		count--;
	}
	
	
	public void addPosition(int value, int pos) {
		//count is nothing but no of nodes
		if(pos<1 || pos > count + 1) {
			System.out.println("invalid position");
			return;
		}
		System.out.println(count);
		Node newnode = new Node(value);
		//if list is empty
		if(tail == null) {     // if(isEmpty()) instead of calling this function and creating
			                  // FAR that can increase T(n) is some bit we can use tail which is a field/variable only
			addFirst(value);
		}
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		
		// pos is not > 1
		else {
			Node trav = tail.next;
			for(int i=1 ; i < pos - 1; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
			
			// *imp : tail must be move to new last node if pos is count + 1
			if(trav == tail) // pos == count+1 better is -> trav == tail
				tail = newnode;
		}
		
		count++;
	}
	
	public void deletePosition(int pos) {
		if(pos < 1 || pos > count) {
			System.out.println("invalid position");
			return;
		}
		
		if(tail == null) {
			return;
		}
		else if(pos == 1) {
			tail = null;
		}
		else {
			//pos > 1 or < count
			Node trav = tail.next; // initialize trav to 1st element
			for(int i = 1; i<pos-1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
		
		count--;
	}
	
}
