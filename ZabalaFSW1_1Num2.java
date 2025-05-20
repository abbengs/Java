public class ZabalaFSW1_1Num2 {
  public static void main(String[] args) {
    // Initialize a 2D array
    int[][] array = { { 2, 4, 6 },
        { 8, 10, 12 },
        { 14, 16, 18 } };

    // Print the 2D array
    System.out.println("The 2D array is: ");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    // Calculate and print the sum of each row
    for (int i = 0; i < array.length; i++) {
      int rowSum = 0;
      for (int j = 0; j < array[i].length; j++) {
        rowSum += array[i][j];
      }
      System.out.println("The sum of row " + (i + 1) + " is: " + rowSum);
    }
  }
}
