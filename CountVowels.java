/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Count Vowels
   - Problem: Write a method that takes a string and returns the number of vowels in the string.
   - Example: For the string `"hello world"`, the method should return `3`.
*/

import java.util.Scanner;

public class CountVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a word: ");
    String word = input.nextLine().toLowerCase();
    
    int vowels = countVowels(word);
    System.out.println("Number of vowels: " + vowels);
  }
  
  public static int countVowels(String word) {
    char[] letters = word.toCharArray();
    int vowels = 0;
    
    for(char letter : letters) {
      if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        vowels++;
      }
    }
    return vowels;
  }
}