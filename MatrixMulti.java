/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Matrix Multiplication
   - Problem: Write a method that takes two 2D arrays (matrices) and returns their product. Assume the matrices are compatible for multiplication.
   - Example: For arrays `[[1, 2], [3, 4]]` and `[[5, 6], [7, 8]]`, the method should return `[[19, 22], [43, 50]]`.
*/

public class MatrixMulti {
  public static void main(String[] args) {
    int[][] matrixA = {
      {1, 2},
      {3, 4}
    };
    
    int[][] matrixB = {
      {5, 6},
      {7, 8}
    };
    
    int[][] matrixC = calculateProduct(matrixA, matrixB);
    System.out.println("The product of two matrix is:");
    for(int[] matrix : matrixC) {
      for(int element : matrix) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
  
  public static int[][] calculateProduct(int[][] matrixA, int[][] matrixB) {
    int[][] result = new int[2][2];
    
    for(int i = 0; i < result.length; i++) {
      for(int j = 0; j < result[i].length; j++) {
        result[i][j] = matrixA[i][j] * matrixB[i][j];
      }
    }
    return result;
  }
}