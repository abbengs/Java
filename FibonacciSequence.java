/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Fibonacci Sequence
   - Problem: Write a method that takes a non-negative integer `n` and returns the `n`nth Fibonacci number.
   - Example: For `n = 7`, the method should return `13`.
*/
import java.util.Scanner; 

public class FibonacciSequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num = 0;
    boolean validInput = false;
    
    while(!validInput) {
      try {
        System.out.print("Enter a number: ");
        num = input.nextInt();
      
        if(num < 0) {
          throw new IllegalArgumentException("Please enter a positive number.\n");
        } else {
          validInput = true;
        }
      
      } catch(IllegalArgumentException e) {
        System.out.print(e.getMessage());
      }
    }
    
    int[][] nums = new int[num][1]; 
    int l = nums.length;
    
    int[][] result = generateFibonacci(nums);
    System.out.print("`n`nth Fibonacci number: " + result[num - 1][0]);
  }
  
  public static int[][] generateFibonacci(int[][] nums) {
    int l = nums.length;
    int[][] result = new int[l][1]; 
    
    result[0][0] = 0;
    result[1][0] = 1; 
    
    for(int i = 2; i < l; i++) {
      result[i][0] = result[i - 1][0] + result[i - 2][0];
    }
    return result;
  }
}