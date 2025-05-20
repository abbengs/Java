/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Problem: Write a method that takes a square 2D array (matrix) of integers and, returns a new matrix that is rotated 90 degrees clockwise.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `[[7, 4, 1], [8, 5, 2], [9, 6, 3]]`.
*/

public class RotateArray {
  public static void main(String[] args) {
    int[][] numbers = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    int[][] rotatedArray = rotateArray(numbers);
    for(int[] nums : rotatedArray) {
      for(int num : nums) {
        System.out.print(num + " ");
      }
      System.out.println(); 
    }
  }
  
  public static int[][] rotateArray(int[][] numbers) {
    int l = numbers.length; 
    int[][] result = new int[l][l];
    
    System.out.println("Rotated array:");
    for(int i = 0; i < l; i++) {
      for(int j = 0; j < l; j++) {
        result[j][l - 1 - i] = numbers[i][j];
      }
    }
    return result;
  }
}