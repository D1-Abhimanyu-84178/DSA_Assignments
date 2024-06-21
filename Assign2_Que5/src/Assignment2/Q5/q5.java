package Assignment2.Q5;

class Stack{
	private int size;
	private int top;
	private int arr[];
	public Stack(int size) {
		this.size = size;
		arr= new int [size];
		top=size;
	}
	
	public boolean isEmpty() 
	{
		if(top == size) {
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(top==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void peek() {
		if(!isEmpty())
		System.out.println(arr[top]);
		else
		System.out.println("Stack is Empty...!!!");
	}
	public void push(int value) {
		if(isEmpty()) {
			arr[--top]=value;
		}else if(top>0) {
			top--;
			arr[top]=value;
		}else {
			System.out.println("Array is Full");
		}
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Array is Empty Already !!");
		    return;
		}
		if(top<size) {
			top++;
		}
	}
	
}

public class q5 {

	public static void main(String[] args) {
		Stack st = new Stack(4);
		st.push(1);
		//st.push(2);
		//st.push(3);
		//st.push(4);
		st.pop();
		st.peek();
	}

}
