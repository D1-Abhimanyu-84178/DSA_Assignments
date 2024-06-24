package com.dsa.assignments;

public class Stack {
	    private static class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	            this.next = null;
	        }
	    }

	    private Node top;

	    Stack() {
	        this.top = null;
	    }

	    public void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top;
	        top = newNode;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("pop from empty stack");
	        }
	        int value = top.value;
	        top = top.next;
	        return value;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("peek from empty stack");
	        }
	        return top.value;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        System.out.println(stack.pop());  // Output: 3
	        System.out.println(stack.peek());  // Output: 2
	        System.out.println(stack.isEmpty());  // Output: false
	    }
	}
