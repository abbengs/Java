/*
Composed by: Neil Jay Lacandazo, freshman Information Systems student
Date: June 14, 2024

Factorial Calculation
   - Problem: Write a method that takes a non-negative integer and returns its factorial.
   - Example: For the integer `5`, the method should return `120`.
*/

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num = 0;
    int numFactorial = 0;
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
    
    if(num != 0) {
      numFactorial = calculateFactorial(num);
      System.out.println("The factorial of " + num + " is " + numFactorial + ".");
    } else {
      System.out.println("The factorial of 0 is 1.");
    }
  }
  
  public static int calculateFactorial(int num) {
    int result = 1;
    
    while(num != 0) {
      result *= num; 
      num--;
    }
    return result;
  }
}