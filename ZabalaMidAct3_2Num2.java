import java.util.*;

public class ZabalaMidAct3_2Num2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // Initialize the grades array
            double[] grades = { 85.5, 92.0, 78.5, 65.0, 70.5, 88.0, 60.5, 95.0 };
    
            // Display all the grades
            System.out.println("All grades:");
            for (double grade : grades) {
                System.out.print(grade + " ");
            }
            System.out.println(); // Print a newline
    
            // Calculate the number of passing and failing grades
            int passingCount = 0;
            int failingCount = 0;
            for (double grade : grades) {
                if (grade >= 70.0) {
                    passingCount++;
                } else {
                    failingCount++;
                }
            }
    
            // Display the results
            System.out.println("Passing grades: " + passingCount);
            System.out.println("Failing grades: " + failingCount);
        }
    }
    

