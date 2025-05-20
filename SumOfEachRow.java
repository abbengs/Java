/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Sum of Each Row
   - Problem: Write a method that takes a 2D array of integers and returns a 1D array where each element is the sum of the corresponding row in the 2D array.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `[6, 15, 24]`.
*/

public class SumOfEachRow {
  public static void main(String[] args) {
    int[][] nums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    calculateRowSum(nums);
  }
  
  public static void calculateRowSum(int[][] nums) {
    System.out.print("The sum of each row is: ");
    for(int i = 0; i < nums.length; i++) {
      int rowSum = 0;
      for(int j = 0; j < nums[i].length; j++) {
        rowSum += nums[i][j];
      }
      System.out.print(rowSum + " ");
    }
  }
}