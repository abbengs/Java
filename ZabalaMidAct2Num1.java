import java.util.Scanner;
public class ZabalaMidAct2Num1{
    public static void main (String [] args) {
	                                                       
		try (Scanner scan = new Scanner(System.in)) {
             double average = 0.0;
             double tuitionFee = 0.0;
             double discount = 0.0;
     
  try {
   System.out.print("Student Name: ");
   String name = scan.nextLine();
   System.out.print("Average: ");
   average = scan.nextDouble();
   System.out.print("Tuition Fee: ");
   tuitionFee = scan.nextDouble(); 
   } catch (Exception e ) {
	System.out.print("Invalid");
	return;
   }
 if (average >= 95) {
	discount = 1.0;
 }else if (average <=94){
	discount = .25;
 }else if (average <=89){
   discount = .10;
 }else {
	discount = 0.0;
 }
  double totalTuitionFee = tuitionFee - (tuitionFee * discount);
 System.out.println("Your Total Tuition Fee are:" + totalTuitionFee);
        }
 
	}
}