
import java.util.*;

public class ZabalaMidAct3_2Num3 {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // Initialize the months array
            String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
            };
    
            // Print the months in descending order
            System.out.println("Months in descending order:");
            for (int i = months.length - 1; i >= 0; i--) {
                System.out.println(months[i]);
            }
        }
    }
    

