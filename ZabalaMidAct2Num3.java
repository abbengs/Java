import java.util.Scanner;
public class ZabalaMidAct2Num3 {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      try {
   System.out.print("Choices: C=Circle, S=Square, R=Rectangle, T=Triangle: ");
   char choice = scanner.next().charAt(0);
          
          if (choice == 'c' || choice == 'C') {
           
  System.out.print("What is the radius of the circle: ");
  double radius = scanner.nextDouble();
  double circleArea = 3.14 * (radius * radius);
  System.out.println("Area of a Circle is: " + circleArea);
           
   }else if (choice == 's' || choice == 'S') {
  System.out.print("What is the side of the square: ");
  double side = scanner.nextDouble();
  double squareArea = side * side;
  System.out.println("Area of a square is: " + squareArea);
                 
   } else  if (choice == 'r' || choice == 'R') {
  System.out.print("What is the Lenght of a Rectangle: ");
  double length = scanner.nextDouble();
  System.out.print("What is the width of a Rectangle:");
  double width = scanner.nextDouble();
  double lengthWidth = length * width;
  System.out.println("Length and Width of rectangle is: " + lengthWidth);
                 
   }else if (choice == 't' || choice == 'T') {
  System.out.print(" What is the Base of a Triangle: ");
  double base = scanner.nextDouble();
  System.out.print(" What is the Height of a Triangle:");
  double height = scanner.nextDouble();
  double baseHeight = 0.5 * (base * height);
  System.out.println("Base and Height of a Triangle is: " + baseHeight);
   
   }else{
  System.out.println("Invalid choice!");
   }
      } catch (Exception e) {
 System.out.println("Input error: " + e.getMessage());
   
      }
    }
    }
}