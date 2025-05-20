import java.util.Scanner;

public class ZabalaFinalSW2_1Num2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Input string
        System.out.print("Enter a string: ");
        String inpuString=scanner.nextLine();

        //Remove spaces and convert to lowercase for case-intensitive check
        String processedString=inpuString.replaceAll("\\s", " ").toLowerCase();

        //Check if the string is palindrome
        boolean isPalindrome=true;
        for (int i = 0; i <processedString.length()/2; i++) {
            if(processedString.charAt(i)!=processedString.charAt(processedString.length()-1-i)){
                isPalindrome=false;
                break;
            }
            
        }
        //Output result
        if(isPalindrome){
            System.out.println("The string is palindrome. ");
        }
        else{
            System.out.println("The string is not palindrome. ");
        }
        scanner.close();
    }
}
