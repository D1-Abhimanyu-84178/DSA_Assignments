package com.dsa.assignments;

public class Deque {
	    private static class Node {
	        int value;
	        Node next;
	        Node prev;

	        Node(int value) {
	            this.value = value;
	            this.next = null;
	            this.prev = null;
	        }
	    }

	    private Node front;
	    private Node rear;

	    public Deque() {
	        this.front = this.rear = null;
	    }

	    public void addFirst(int value) {
	        Node newNode = new Node(value);
	        if (isEmpty()) {
	            front = rear = newNode;
	        } else {
	            newNode.next = front;
	            front.prev = newNode;
	            front = newNode;
	        }
	    }

	    public void addLast(int value) {
	        Node newNode = new Node(value);
	        if (isEmpty()) {
	            front = rear = newNode;
	        } else {
	            newNode.prev = rear;
	            rear.next = newNode;
	            rear = newNode;
	        }
	    }

	    public int removeFirst() {
	        if (isEmpty()) {
	            throw new IllegalStateException("removeFirst from empty deque");
	        }
	        int value = front.value;
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        } else {
	            front.prev = null;
	        }
	        return value;
	    }

	    public int removeLast() {
	        if (isEmpty()) {
	            throw new IllegalStateException("removeLast from empty deque");
	        }
	        int value = rear.value;
	        rear = rear.prev;
	        if (rear == null) {
	            front = null;
	        } else {
	            rear.next = null;
	        }
	        return value;
	    }

	    public int peekFirst() {
	        if (isEmpty()) {
	            throw new IllegalStateException("peekFirst from empty deque");
	        }
	        return front.value;
	    }

	    public int peekLast() {
	        if (isEmpty()) {
	            throw new IllegalStateException("peekLast from empty deque");
	        }
	        return rear.value;
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public static void main(String[] args) {
	        Deque deque = new Deque();
	        deque.addFirst(1);
	        deque.addLast(2);
	        deque.addFirst(3);
	        System.out.println(deque.removeFirst());  // Output: 3
	        System.out.println(deque.peekFirst());    // Output: 1
	        System.out.println(deque.peekLast());     // Output: 2
	        System.out.println(deque.isEmpty());      // Output: false
	        System.out.println(deque.removeLast());   // Output: 2
	        System.out.println(deque.isEmpty());      // Output: false
	    }

}
