package com.dsa.assignment;

public class PriorityQueue {

	private int SIZE;
	
	public PriorityQueue() {
		SIZE = 0;
	}
	
	public void addHeap(int arr[]) {
		SIZE++;
		
		//assign the very first element to first index
		// right now entire array is there
		
		//get child and parent index here we would require parent because we have check child and parent if greater
		
		int ci = SIZE;
		int pi = ci / 2;
		
		while(pi >= 1 ) {
			
			//this means ci at its position properly break for now
			if(arr[ci] > arr[pi])
				break;
			
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = arr[ci];
			
			//update the child
			ci = pi;
			pi = ci/2;
		}
	}
	
	public int deleteHeap(int arr[]) {
		// deleting from heap means deleting very first element (max) from heap
		// deleting means adding it to any other index and that index element to deleted element ( we will not actually delete like null 
		// and all cause if we delete like that entire heap structure will get destroyed
		
		int min = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = min;
		SIZE--;
		
		int pi = 1;
		int ci = 2 * pi;
	
		while(ci <= SIZE) {
			
		//check if any left or right is smaller than pi
			
			//check which is smaller left or right means ci or ci + 1 
			if(ci + 1 <= SIZE && arr[ci+1] < arr[ci])
				ci = ci+1;
			//2. after you got greater check whether is it less than pi if true then no need to change anything just break
			if(arr[ci] > arr[pi])
				break;
			
		   int temp = arr[ci];
		   arr[ci] = arr[pi];
		   arr[pi] = temp;
		   
	       pi = ci;
	       ci = pi * 2;
 		}
		//we can return max which is deleted element
		return min;
	}
	
	public void addintoHeap(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			addHeap(arr);
		}
	}
	public void heapSort(int arr[]) {
		//addHeap
//		for(int i = 0; i < arr.length; i++) {
//			addHeap(arr);
//		}
//		
		for(int i = 0; i < arr.length; i++) {
			deleteHeap(arr);
		}
	}
}
