/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Diagonal Difference
   - Problem: Write a method that takes a square 2D array of integers and returns the absolute difference between the sums of its diagonals.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `0`.
*/

public class DiagonalDifference {
  public static void main(String[] args) {
    int[][] nums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    System.out.println("The diagonal difference is: " + calculateDiagonalDifference(nums));
  }
  
  public static int calculateDiagonalDifference(int[][] nums) {
    int l = nums.length;
    int primaryDiagonal = 0;
    int secondaryDiagonal = 0; 
    
    for(int i = 0; i < l; i++) {
      primaryDiagonal += nums[i][i];
      secondaryDiagonal += nums[i][l - 1 - i];
    }
    return Math.abs((primaryDiagonal - secondaryDiagonal));
  }
}