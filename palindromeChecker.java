// question:-
 //Check for Palindrome Number: Write a program to check if a number is a palindrome (e.g., 121).

public class PalindromChecker {
	
	int j;
	// defining the method to check either the string is pallindrome or not
		public void palindromeChecker(String  word) {
			System.out.println(word);
			for( int i = 0, j =word.length() -1 ; i<j ;i++ ,j--) { // here we used the condition with two variables , if they satify only than String will be pallindrome
				if(word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j)) { 
					System.out.println(word +" is pallindrome");
					return;
				}
				else {
					System.out.println(word+ " is not pallindrome");
					return;
				}
			}
				}
		 public static void main(String args[]) {
			 PalindromChecker p1 = new PalindromChecker();
			 p1.palindromeChecker("mada");
			  p1.palindromeChecker("mADAM");
		 }
		}
		 
		 
