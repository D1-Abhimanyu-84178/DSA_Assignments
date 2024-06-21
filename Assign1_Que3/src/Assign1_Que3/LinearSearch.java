package Assign1_Que3;

public class LinearSearch {

	public static int linearSerach(int [] arr, int SIZE, int key) {
		int count = 0;
		for (int i : arr) {
			count++;
			if(i == key) {
	       System.out.println(count);		
			return 0;
		}
	}
		System.out.println(count);
		return -1;
}
	public static void main(String[] args) {
     
		int [] arr = new int[] {2,3,5,6,7,3,6,1,9,0,8};
		int key = 10;
		System.out.println(linearSerach(arr,arr.length,key));
	}
}
