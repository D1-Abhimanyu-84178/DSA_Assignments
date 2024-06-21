package Assign1_Que1_Palindrome;

public class StringPalindrome {

	public static String stringPalindrome(String str) {
	    StringBuffer newString = new StringBuffer();
	    for(int i = str.length()-1; i>=0; i--) {
	    	newString.append(str.charAt(i));
	    }
	    return newString.toString();
	}
	public static void main(String[] args) {

		String str = "abccba";
		
		if(str.equals(stringPalindrome(str))) {
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
	}

}

/*
 * T(n) = O(n)  --> size of string can be N so there would be N no of iterations
 * 
 * S(n) = we are storing string which may be considerd as constant so O(n)
 * 
 * */
