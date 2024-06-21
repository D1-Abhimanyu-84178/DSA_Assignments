package Assignment2.q8;


class circularQue{
	private int arr[];
	private int front;
	private int rear;
	private int counter;
	private int size;
	
	public circularQue(int size) {
		this.size = size;
		arr = new int[size];
		front=-1;
		rear=-1;
		counter=0;
	}
    
	public boolean isEmpty() {
		if(front==rear && rear == -1) {
			return true ;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		return (front == -1 && rear == size-1) ||  (front == rear && rear != -1);
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		//a. read/return data of front + 1 index
		return arr[(front + 1) % size];
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		//a. reposition rear
		rear = (rear + 1) % size;		// change
		//b. add value at rear index
		arr[rear] = value;
		counter++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int value = arr[(front + 1) % size];
		//a. reposition front
		front = (front + 1) % size;
		// if queue is empty then move front and rear at -1
		if(front == rear)
			front = rear = -1;
		
		return value;
	}
	
	public void contains() {
		System.out.println(counter);
	}
}

public class q8 {

	public static void main(String[] args) {
		circularQue q1 = new circularQue(4);
		//System.out.println(q1.isEmpty());
	    //System.out.println(q1.isFull());
	    q1.push(3);
	    q1.push(2);
	    System.out.println(q1.pop());
	    q1.peek();
	}

}
