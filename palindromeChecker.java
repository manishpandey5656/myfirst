// question:-
 //Check for Palindrome number: Write a program to check if a number is a palindrome (e.g., 121).

 // public class PalindromChecker {
	
	// int j;
	// // defining the method to check either the string is pallindrome or not
	// 	public boolean palindromeChecker(String  word) {
	// 		System.out.println(word);
	// 		for( int i = 0, j =word.length() -1 ; i<j ;i++ ,j--) { // here we used the condition with two variables , if they satify only than String will be pallindrome
	// 			if(word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j)) { 
	// 				 return true;
					
	// 			}
				  
	// 		}
	// 		return false;
	// 			}
	// 	 public static void main(String args[]) {
	// 		 PalindromChecker p1 = new PalindromChecker();
	// 		 System.out.println(p1.palindromeChecker("mada"));
	// 		  System.out.println(p1.palindromeChecker("mADAM"));
	// 	 }
	// 	}
import java.util.Scanner;

public class PalindromeNumber {
	
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the given number.
        while (number != 0) {
            int digit = number % 10;  
            reversedNumber = reversedNumber * 10 + digit;  
            number = number / 10;  
        }

      
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
         
}

		 
