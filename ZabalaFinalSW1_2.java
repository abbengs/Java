import java.util.Scanner;

public class ZabalaFinalSW1_2 
{
public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
 
 System.out.print("Enter number 1: ");
 double value1 = scan.nextDouble();
 System.out.print("Enter number 2: ");
 double value2 = scan.nextDouble();
 System.out.print("Enter number 3: ");
 double value3 = scan.nextDouble();

 double total = sum(value1,value2,value3);
 double average = ave(total);

 System.out.println("The sum of three numbers: " + total);
 System.out.println("The average of three numbers: " + average); 
}
public static double sum(double num1, double num2, double num3)
{
double result = num1+num2+num3;
return result;
}
public static double ave(double num1)
{
double result = num1/3;
return result;
}
}
