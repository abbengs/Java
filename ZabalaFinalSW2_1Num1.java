import java.util.Scanner;

public class ZabalaFinalSW2_1Num1{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Input string
        System.out.print("Enter a string: ");
        String inpuString = scanner.nextLine();

        //Input character
        System.out.print("Enter a character to count: ");
        char targetChar=scanner.next().charAt(0);

        //Count occurrences of the character 
        int count=0;
        for(int i=0; i<inpuString.length(); i++){
            if(inpuString.charAt(i)==targetChar){
                count++;
            }
        }
        //Output result
        System.out.println("Number of occurrences of " + targetChar + ": " + count);
        scanner.close();
    }
}