import java.util.Scanner;

public class ZabalaMidAct3Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number of times: ");
            int n = scanner.nextInt();

            int product = 1;
            int difference = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Number (" + i + "): ");
                int num = scanner.nextInt();
                product *= num;

                if (i == 1) {
                    difference = num;
                } else {
                    difference -= num;
                }
            }

            System.out.println("\nDifference: " + difference);
            System.out.println("Product: " + product);
        } catch (Exception e) {
            System.out.println("Error: Please input valid number.");
        }
    }
}
