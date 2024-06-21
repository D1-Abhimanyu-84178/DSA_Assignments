package Assign2_Que3;

import java.util.Arrays;

public class q2 {
	
	public static void Insertionsort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			int j=i-1;
			while(j>=0 && element>arr[j]) 
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
	}
	
	public static void main(String[] args) {
	      
		int arr[]= {93,44,12,23,40}; 
		Insertionsort(arr);
        System.out.println(Arrays.toString(arr));		
	}

}
