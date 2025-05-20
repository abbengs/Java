/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Row and Column Sum
   - Problem: Write a method that takes a 2D array of integers and returns a new 2D array where the first row contains the sum of each column and the first column contains the sum of each row.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `[[12, 15, 18], [6, 0, 0], [15, 0, 0], [24, 0, 0]]`.
*/
public class RowAndColumnSum {
  public static void main(String[] args) {
    int[][] nums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    int[][] result = calculateRowAndColumnSum(nums);
    for(int i = 0; i < result.length; i++) {
      for(int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static int[][] calculateRowAndColumnSum(int[][] nums) {
    int[][] result = new int[4][3];
    
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        result[0][j] += nums[i][j];
        result[i + 1][0] += nums[i][j];
      }
    }
    return result;
  }
} 