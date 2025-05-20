/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Sum of Diagonals in a Matrix
   - Problem: Write a method that takes a square 2D array (matrix) and returns the sum of the elements on its main and secondary diagonals.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `30`.
*/

public class DiagonalSum {
  public static void main(String[] args) {
    int[][] nums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    int diagonalSum = calculateDiagonalSum(nums);
    System.out.println("The sum of diagonals is: " + diagonalSum);
  }
  
  public static int calculateDiagonalSum(int[][] nums) {
    int l = nums.length;
    int primaryDiagonal = 0;
    int secondaryDiagonal = 0;
    
    for(int i = 0; i < l; i++) {
      primaryDiagonal += nums[i][i];
      secondaryDiagonal += nums[i][l - 1 - i];
    }
    return primaryDiagonal + secondaryDiagonal;
  }
}