import java.util.Scanner;

public class ZabalaMidAct3Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int numScores = 10;
            int[] scores = new int[numScores];

            for (int i = 0; i < numScores; i++) {
                System.out.print("Number (" + (i + 1) + "): ");
                scores[i] = scanner.nextInt();
            }

            int highest = scores[0];
            int lowest = scores[0];

            for (int i = 1; i < numScores; i++) {
                if (scores[i] > highest) {
                    highest = scores[i];
                }
                if (scores[i] < lowest) {
                    lowest = scores[i];
                }
            }

            System.out.println("Highest Number: " + highest);
            System.out.println("Lowest Number: " + lowest);
        } catch (Exception e) {
            System.out.println("Error: Please input valid number.");
        }
    }
}
