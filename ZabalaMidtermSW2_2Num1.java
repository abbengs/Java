import java.util.*;

public class ZabalaMidtermSW2_2Num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Using do-while loop
        int i = 1;
        System.out.println("Using do-while loop:");
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);

        // Using while loop
        i = 1;
        System.out.println("\nUsing While loop:");
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Using for loop
        System.out.println("\nUsing Loop:");
        for (i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
