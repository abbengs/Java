import java.util.Scanner;

public class ZabalaMidAct3_2Num4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input a string (favorite positive adjective)
        System.out.print("Input a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for consistent counting

        // Initialize counters
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Iterate through each character
        for (char ch : charArray) {
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        // Display the results
        System.out.println("Total Vowels: " + vowelsCount);
        System.out.println("Total Consonants: " + consonantsCount);
    }
}


