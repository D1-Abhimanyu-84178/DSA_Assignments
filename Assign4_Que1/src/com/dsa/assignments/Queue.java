package com.dsa.assignments;

public class Queue {
	    private static class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	            this.next = null;
	        }
	    }

	    private Node front, rear;

	    Queue() {
	    	
	        this.front = this.rear = null;
	    }

	    public void enqueue(int value) {
	        Node newNode = new Node(value);
	        if (this.rear == null) {
	            this.front = this.rear = newNode;
	            return;
	        }
	        this.rear.next = newNode;
	        this.rear = newNode;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("dequeue from empty queue");
	        }
	        int value = front.value;
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	        return value;
	    }

	    public int front() {
	        if (isEmpty()) {
	            throw new IllegalStateException("front from empty queue");
	        }
	        return front.value;
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public static void main(String[] args) {
	        Queue queue = new Queue();
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
	        System.out.println(queue.dequeue());  // Output: 1
	        System.out.println(queue.front());  // Output: 2
	        System.out.println(queue.isEmpty());  // Output: false
	    }
	}
