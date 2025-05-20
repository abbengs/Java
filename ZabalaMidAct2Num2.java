import java.util.Scanner;
public class ZabalaMidAct2Num2{
    public static void main(String args[]) {
        double rateperhour = 0.0;
        double hoursworked = 0.0;
        
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Employee Name: ");
                scanner.nextLine();
                System.out.print("Rate Per Hour: ");
                rateperhour = scanner.nextDouble();
                System.out.print("Number of Hours Worked: ");
                hoursworked = scanner.nextInt();

                double overtimepay = 0.0;

                if (hoursworked >= 8)
                 {
                    double overtimehours = hoursworked - 8;
                    overtimepay = (rateperhour * 1.30) * overtimehours; 
                    
                    hoursworked -= overtimehours; 
                }

                double dailywage = (rateperhour * hoursworked) + overtimepay;
                System.out.println("Your Daily Wage is" +  ": " + dailywage);
      
             } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter valid data.");
      
                
            }
        }
    }
}