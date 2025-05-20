/* 
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Transpose of a Matrix
   - Problem: Write a method that takes a square 2D array (matrix) of integers and returns its transpose.
   - Example: For the array `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`, the method should return `[[1, 4, 7], [2, 5, 8], [3, 6, 9]]`.
*/
public class TransposeOfArray {
  public static void main(String[] args) {
    int[][] nums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    transposeOfArray(nums);
  }
  
  public static void transposeOfArray(int[][] nums) {
    int l = nums.length;
    int[][] transposedNums = new int[l][l];
    
    System.out.println("Transposed array: ");
    for(int i = 0; i < transposedNums.length; i++) {
      for(int j = 0; j < transposedNums.length; j++) {
        transposedNums[i][j] = nums[j][i];
        System.out.print(transposedNums[i][j] + " ");
      }
      System.out.println();
    }
  }
}