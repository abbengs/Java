/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Find Maximum
   - Problem: Write a method that takes an array of integers and returns the maximum element.
   - Example: For the array `[1, 2, 3, 4, 5]`, the method should return `5`.
*/

public class Maximum1D {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5}; 
    
    int max = findMax(nums);
    System.out.println("Maximum element: " + max);
  }
  
  public static int findMax(int[] nums) {
    int max = nums[0]; 
    
    for(int i = 1; i < nums.length; i++) {
      if(nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }
}