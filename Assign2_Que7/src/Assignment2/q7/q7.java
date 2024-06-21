package Assignment2.q7;

import java.util.Arrays;
import java.util.Stack;

public class q7 {
	
	   public static void ReverseUsingStack(int arr[]) {
		   Stack<Integer> st = new Stack<Integer>();
		   for (int i = 0; i < arr.length; i++) {
			st.push(arr[i]);
		    }
		   for (int i = 0; i < arr.length; i++) {
			arr[i]=st.pop();
		}
	   }
	
        public static void main(String[] args) {
			int arr[]= {3,7,8,25,26,13,11};
			ReverseUsingStack(arr);
			System.out.println(Arrays.toString(arr));
		}
}
