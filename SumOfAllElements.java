/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Sum of Elements in a 2D Array
   - Problem: Write a method that takes a 2D array of integers and returns the sum of all its elements.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `45`.
*/

public class SumOfAllElements {
  public static void main(String[] args) {
    int[][] nums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    int sum = calculateSum(nums);
    System.out.println("Sum: " + sum);
  }
  
  public static int calculateSum(int[][] nums) {
    int sum = 0; 
    
    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }
}