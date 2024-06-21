package Assign1_Que1_Palindrome;

import java.util.Scanner;

public class NumberPalindrome {

	public static int checkPalindrome(int number){
		int digit;
		int newNumber = 0;
		while(number>0) {
		digit = number % 10;
		newNumber = newNumber*10 + digit;
		number=number/10;
		}
		System.out.println(newNumber);
		return newNumber;
	}
	public static void main(String [] args) {
		
	    int number = 121;
	    
	    if(number == checkPalindrome(number)) {
	    	System.out.println("the number is palindrome");
	    }
	    else {
	    	System.out.println("not a palindrome");
		    }
	}
}

/* For the Number having n number of digits need to iterate all the numbers So, T(n) = O(n)
 * average T(n) = O(n)
 * Best T(n) = O(1)  --> single digit number
 * 
 * Space Complexity
 * In number palindrome the number itself is constant
 * So the space complexity will be S(n) = O(n)
 * */
