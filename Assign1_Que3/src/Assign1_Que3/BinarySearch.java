package Assign1_Que3;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearch(int[]arr, int SIZE, int key){
		int left = 0, right =arr.length-1, mid, count=0;
     		
		while(left<=right) {
			//find out the mid of array
			mid = (left + right)/2;
			//if key found at mid return key
			if(key == arr[mid]) {
				count++;
				System.out.println("no of comparasions : " + count);
				return mid;
			}
			//if not found divide the array in two subarray left-right
			//if Less get left subarray (from 0 to mid -1)
			// just reinitialize the right next iteration will find out the mid
			else if (key < arr[mid]){
				count++;
				right= mid - 1;   
			}
			//if greater get right subarray (from mid+1 to last index)
			// just reinitialize the right next iteration will find out the mid
			else {
				count++;
				left = mid + 1;
			}
			
		}
		//7. repeat step 2 to 6 till key is not found or array is valid
	    //8. if key is not found, then return -1
		return -1;
		
	}
 public static void main(String[] args) {
		
		int [] arr = new int[] {2,3,5,6,7,3,1,9,0,8};
		int key = 6;
		
	     Arrays.sort(arr);
	     
		// 0,1,2,3,4,5,6,7,8,9
		int index  = binarySearch(arr, arr.length, key);
		System.out.println("key : " + index);
   }
}

/*
 * binary search
 * 1.get an array
 * 2.find out the mid of array
 * 3.if key found return key
 * 4.if not found divide the array in two subarray left-right
 * 5.check if key is less than or greater than mid.
 * 6. 
 *    a. if Less get left subarray (from 0 to mid -1)
 *    b. if greater get right subarray (from mid+1 to last index)
 * 6.repeat from 2 to 6 till key is found or left <=right
 * 
*/
