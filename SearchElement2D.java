/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Search Element in 2D Array
   - Problem: Write a method that takes a 2D array and an integer, and returns a boolean indicating whether the integer is present in the 2D array.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]` and integer `5`, the method should return `true`.
*/

import java.util.Scanner;

public class SearchElement2D {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int[][] nums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    System.out.print("Find number: ");
    int num = input.nextInt();
    
    boolean isFound = findNum(nums, num);
    System.out.println("Found? " + isFound);
  }
  
  public static boolean findNum(int[][] nums, int num) {
    boolean found = false;
    
    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < nums[i].length; j++) {
        if(num == nums[i][j]) {
          found = true;
        }
      }
    }
    return found;
  }
}