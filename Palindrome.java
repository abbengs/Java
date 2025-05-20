/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Palindrome Check
   - Problem: Write a method that takes a string and returns `true` if the string is a palindrome, and `false` otherwise.
   - Example: For the string `"madam"`, the method should return `true`.
*/

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a word: ");
    String word = input.nextLine().toLowerCase();
    
    boolean isPalindrome = palindromeChecker(word);
    System.out.println("Palindrome? " + isPalindrome);
  }
  
  public static boolean palindromeChecker(String word) {
    if(word == null) {
      return false;
    }
    
    int left = 0; 
    int right = word.length() - 1;
    
    while(left < right) {
      if(word.charAt(left) != word.charAt(right)) {
        return false;
      }
      
      left++; 
      right--;
    }
    return true;
  }
}