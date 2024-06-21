package Assignment2.Q4;


class LinearQue{
	private int arr[];
	private int front,rear;
	private int Size;
	
	public LinearQue(int size) {
		Size = size;
		arr = new int[Size];
		front=0;
		rear=0;
	}
	
	public boolean isEmpty() {
		if(front==rear && rear == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(rear == Size-1)
			return true;
		
		return false;
	}
	
	public void peek() {
		if(!isEmpty() && front<rear)
		System.out.println(arr[front]);
		else
		System.out.println("Queue is Empty !");
	}
	
	public void push(int value) {
		if(isEmpty()){
			arr[rear]=value;
			rear++;
		}
		else 
		{
			if(rear<Size) {
				arr[rear]=value;
				rear++;
			}else {
				System.out.println("Array is Full");
			}
		}
	}
	
	public int pop() {
		if(front < rear) {
			int value = arr[front]; 
			front++;
			return value;
		}else {
			return -1;
		}
			
	}
}

public class q4 {
     public static void main(String[] args) {
	    LinearQue q1 = new LinearQue(4);
    	q1.push(2);
    	q1.push(3);
    	q1.pop();
    	q1.pop();
    	q1.peek();
    	

	 
	
	}
}
