
package com.assignmen1;

public class Question5 {

	static int BinarySearch(int arr[],int key) 
	{
		int left =0;
		int right =arr.length-1;
		int mid;
		while(left<=right) 
		{
		    mid = (left+right)/2;
		    if(key==arr[mid]) {
		    	return mid;
		    }else if (arr[mid]<key) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		    
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {99,88,77,66,55,44,33,22,11};
		
          System.out.println("element found at index :"+ BinarySearch(arr, 11));
	}

}
