import java.util.*;
  public class ZabalaMidAct3_2Num1{
   public static void main(String[] args) {
   	
   	Scanner sc = new Scanner(System.in);

     String favoriteAdjective = "INDEPENDENT";

     char[] letters = favoriteAdjective.toCharArray();

     System.out.println("Adjective: " + favoriteAdjective);

     System.out.print("Reversed Adjective: ");

     for(int n = letters.length -1; n >= 0; n--) {

     System.out.print(letters[n]);
  
    }
  }
}