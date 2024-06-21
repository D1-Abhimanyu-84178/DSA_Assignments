package Assignment3.q3;

import java.util.Stack;

class List{
	static class Node{
		int data;
		Node next;
		public Node(int data) {		
			this.data = data;
			next=null;
		}
	}
	Node head;
	int count;
	public List() {
		this.head = null;
		this.count = 0;
	}
	public boolean isEmpty() 
	{
	    return head == null;	
	}
	public void deleteAll() {
		head=null;
		count=0;
	}
	public int size() {
		return count;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
			Node trav=head;
			while(trav!=null) {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
			System.out.println();
		}
		
	}
	public void addFirst(int value) {
		Node n1 = new Node(value);
		if(isEmpty()) {
			head = n1;
		}else {
			n1.next=head;
			head=n1;
		}
		count ++;
	}
	public void addLast(int value) {
		Node n1 = new Node(value);
		if(isEmpty()) {
			head=n1;
		}
		else {
			Node Trav = head;
			while(Trav.next != null) {
				Trav=Trav.next;
			}
			Trav.next=n1;
		}
		count++;
	}
	public void inserAfter(int value , int position) {
		if(position<1 || position > count+1) {
			System.out.println("invalid position");
			return;
		}else if(position==1) {
			addFirst(value);
		}else {
			Node trav = head;
			for (int i = 0; i < position-1; i++) {
				trav = trav.next;
			}
			Node n = new Node(value);
			n.next = trav.next;
			trav.next=n;
		
			count++;
		}
		
	}
	public void inserBefore(int value , int position) {
		if(position<1 || position > count+1) {
			System.out.println("invalid position");
			return;
		}else if(position==1) {
			addFirst(value);
		}else {
			Node trav = head;
			for (int i = 0; i < position-2; i++) {
				trav = trav.next;
			}
			Node n = new Node(value);
			n.next = trav.next;
			trav.next=n;
		
			count++;
		}
		
	}
	public int deleteFirst() {
		if(isEmpty()) {
			return 0;
		}else {
			int value = head.data;
			head = head.next;
			count--;
			return value;
		}
	}

}
public class q3 {
	
	
	public static void displayReverse(List l1)
	{
		//System.out.println(l1.size());
		int listSize= l1.size();
		//l1.display();
	  	Stack<Integer> temp = new Stack<Integer>();
	  	for (int i = 0; i < listSize; i++) {
			//System.out.println(l1.deleteFirst());
	  		temp.push(l1.deleteFirst());
		}
	  	//System.out.println(temp.toString());
	  	while(!temp.isEmpty()) 
	  	{
	  		int value = temp.pop();
	  		System.out.print(value +" ");
	  		l1.addFirst(value);
	  	}
	  	System.out.println();
	}
	
	
	
	
       public static void main(String[] args) {
	     List l1 = new  List();
	     l1.addFirst(10);
	     l1.addFirst(9);
	     l1.addFirst(8);
	     l1.addFirst(7);
	     l1.addFirst(6);
	     l1.addFirst(5);
	     l1.addFirst(4);
	     l1.addFirst(3);
	     l1.addFirst(2);
	     l1.addFirst(1);
	     System.out.println("After functionCall:");
	     displayReverse(l1);
	     System.out.println("Original :");
	     l1.display();
	     
	}
}
