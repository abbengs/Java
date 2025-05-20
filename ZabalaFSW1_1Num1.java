public class ZabalaFSW1_1Num1 {
    public static void main(String[] args)
    {
    //Initialize a 2D array
    int[][] array =
            {{1,2,3},
             {4,5,6},
             {7,8,9}};

    //Variable to hold the sum of all elements
    int sum = 0;
    
    //Calculate the sum of all elements and print the array
    System.out.println("\nThe 2D array is: ");

    for(int i = 0; i<array.length; i++)
    {
      for (int j = 0; j<array[i].length; j++)
      {
        System.out.print(array[i][j] + "");
        sum += array[i][j];
      }
      System.out.println();
    }

    //Print the sum of all elements
    System.out.println("\nThe sum of all the elements in the array is: "+ sum);
     }
}
