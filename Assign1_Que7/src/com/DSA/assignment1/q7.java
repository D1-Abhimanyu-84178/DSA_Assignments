package com.DSA.assignment1;

import java.util.Iterator;

public class q7 {
	
	public static int unique(int arr[]) {
	     for (int i = 0; i < arr.length-1; i++) {
	    	 int count =0;                	    	 
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==0) {
				return arr[i];
			}
		}
	     return -1;
	}

	public static void main(String[] args) {
		     int arr[]  = { 1, 2, 3, 2,-1, 1, 0, 4, -1, 7, 8 } ;
		     
		     System.out.println(unique(arr));

	}

}
