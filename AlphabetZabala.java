import javax.swing.JOptionPane;

public class AlphabetZabala {
	
public static void main(String[] args) {
	
        //Dialog for number
        String numberInput = JOptionPane.showInputDialog("Enter number:");
        int number = Integer.parseInt(numberInput);
        char alphabet = numberToAlphabet(number);
        JOptionPane.showMessageDialog(null, "The character in the alphabet is " + alphabet);

        //Dialog for character
        String characterInput = JOptionPane.showInputDialog("Enter a character from the Alphabet:");
        char character = characterInput.charAt(0);
        int position = alphabetToNumber(character);
        JOptionPane.showMessageDialog(null, "That character is the " + position + "th letter.");
    }
    public static char numberToAlphabet(int number) {
        return (char) ('A' + number - 1);
    }
    public static int alphabetToNumber(char character) {
        return Character.toUpperCase(character) - 'A' + 1;
    }
}
