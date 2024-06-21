package Assign1_Que2_LinearSearch;

public class LinearSearch {

	public static int linearSearch(int arr[],int SIZE, int key){
	   for(int i = SIZE-1 ; i>=0; i--) {
		   if(arr[i] == key)
			   return i;
	   }
	   return -1;
	}
	public static void main(String[] args) {

		int [] arr = new int[] {2,3,5,6,7,3,6,1,3,9,0,1,8};
		int key = 3;
		int index;
        if((index = linearSearch(arr, arr.length, key)) >= 0) {
        	System.out.println(index);
        } else {
        	System.out.println("not found");
        }
	}

}

/* 
 * the Worst T(n) = O(n)
 * */
