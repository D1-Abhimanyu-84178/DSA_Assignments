package Assign1_Que1_Palindrome;

public class ArrayPalindrome {

	public static int [] checkPalindrome(int arr[], int N) {
		int newArray[] = new int [N];
		for(int i = 0; i<N; i++) {
		    newArray[i] = arr[(N-1) - i];
		}
		return newArray;
	};
	public static void main(String [] args) {
		int [] arr = new int[]{1, 2, 3, 4, 3, 2, 1};
		boolean isSame = false;
		
		int [] newArray = checkPalindrome(arr, arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == newArray[i]) {
				isSame = true;
			}
			else {
				isSame = false;
				break;
			}
		}
	
		if(isSame) {
			System.out.println("The given array is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
}
	
}
