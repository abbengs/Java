import java.util.Scanner;

public class ZabalaFinLab2_1
{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String name= inputName(sc);
		int age=inputAge(sc);
		double grade=inputGrade(sc);
		displayInfo(name, age, grade);
	}
	
	//Method to input the name
	public static String inputName(Scanner sc)
	{
	 System.out.print("Enter the student's name: ");
	 return sc.nextLine();
	}
	
	//Method to input the age
	public static int inputAge(Scanner sc)
	{
	 System.out.print("Enter the student's age: ");
	 return sc.nextInt();
	}
	
	//Method to input the grade
	public static double inputGrade(Scanner sc)
	{
	 System.out.print("Enter the student's grade: ");
	 return sc.nextDouble();
	}
	
	//Method to display the name, age, and grade
	public static void displayInfo(String name, int age, double grade)
	{
	 System.out.println("\nStudent Information:");
	 System.out.print("Name: " + name);
	 System.out.print("\nAge: " + age);
	 System.out.print("\nGrade: " + grade);
	 
	
	}
}