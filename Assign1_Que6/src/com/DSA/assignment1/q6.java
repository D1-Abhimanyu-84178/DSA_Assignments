package com.DSA.assignment1;

public class q6 {
    public static int nthOccurance(int arr[],int key,int N) 
    {
    	int comparision=0;
        for (int i = 0; i < arr.length; i++) {
			 if(arr[i]==key) {
				 comparision++;
				 if(comparision==N) {
					 return i;
				 }
			 }
		} 
        return -1;
    }
	
	
	public static void main(String[] args) {
          
		
		int arr[]= {11,22,11,55,11,11,9,11};
        System.out.println(nthOccurance(arr, 11, 9));	 

	}

}
