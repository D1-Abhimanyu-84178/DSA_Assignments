package Assignment2.Questions;

import java.util.Arrays;

public class q1 {
	
	public static void insertionSort(int arr[]) 
	{
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>element  ) {
                	arr[j+1]=arr[j];
                    j--;			
			}			
			arr[j+1]=element;	
		}
	}

	public static void main(String[] args) {
		int arr[]= {12,45,33,77,11};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
	}

}
