package com.DSA.assignment1;

import java.util.Arrays;

public class q9 {
    public static int SelectionSort(int arr[]) {
    	int comparision=0;
    	for (int i = 0; i < arr.length-1; i++) {
			 for (int j = i+1; j < arr.length; j++) {
				comparision ++;
				 if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
    	return comparision;
    }
	public static void main(String[] args) {
		 
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } ;
		
		System.out.println("no of comparisions :" +SelectionSort(arr)+"\n" + Arrays.toString(arr));

	}

}
