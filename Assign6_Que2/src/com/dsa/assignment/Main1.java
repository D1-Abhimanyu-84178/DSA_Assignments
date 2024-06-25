package com.dsa.assignment;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};
		
		PriorityQueue pq = new PriorityQueue();
		
		System.out.println("Array before : " + Arrays.toString(arr));
       pq.addintoHeap(arr);
		System.out.println("first element : ");
		pq.deleteHeap(arr);
		h.heapSort(arr);
		System.out.println("Array after : " + Arrays.toString(arr));
	}

}
