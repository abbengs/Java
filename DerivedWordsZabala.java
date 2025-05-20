import javax.swing.JOptionPane;

public class DerivedWordsZabala {

    public static void main(String[] args) {
    	
        String word = "Madagascar";
        String derivedWord1 = deriveWord(word, 0, 3); 
        String derivedWord2 = deriveWord(word, 4, 7); 
        String derivedWord3 = deriveWord(word, 7, 10); 

        JOptionPane.showMessageDialog(null,"Madagascar"+ "\nThe Derived Words are:\nWord 1: " + derivedWord1 +
                                            "\nWord 2: " + derivedWord2 +
                                            "\nWord 3: " + derivedWord3);
    }
    public static String deriveWord(String originalWord, int start, int end) {
        return originalWord.substring(start, end);
    }
}
