package Assignment2.q6;

import java.util.Stack;

public class q6 {
	  public static int maxOfStack(Stack<Integer> st) {
		  Stack<Integer> fs = new Stack<Integer>();
          fs.addAll(st);
          int max=0;
          while(!fs.isEmpty()) {
        	  int poped =fs.pop();
        	  if(poped>max) {
        		 max=poped;
        	  }
          }
          return max;
	  }   
	
      public static void main(String[] args) {
       Stack<Integer>st = new Stack<Integer>();
       st.push(5);	   
       st.push(4);	   
       st.push(13);	   
       st.push(2);	   
       st.push(1);	   
       System.out.println(maxOfStack(st));
       System.out.println(st.peek());
	}
       
       
}
