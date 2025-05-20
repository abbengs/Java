/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Find Maximum Element in 2D Array
   - Problem: Write a method that takes a 2D array of integers and returns the maximum element.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `9`.
*/

public class Maximum2D {
  public static void main(String[] args) {
    int[][] nums = {
      {6, 2, 7},
      {4, 9, 1},
      {3, 8, 5}
    };
    
    int max = findMax(nums);
    System.out.println("Max: " + max);
  }
  
  public static int findMax(int[][] nums) {
    int max = nums[0][0];
    
    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < nums[i].length; j++) {
        if(nums[i][j] > max) {
          max = nums[i][j];
        }
      }
    }
    return max;
  }
}