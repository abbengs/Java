
import javax.swing.JOptionPane;
/** 
* A program that uses JOptionPane to get five numbers 
* from the user then outputs the largest number.
*/
public class ZabalaGreatestNumber{
public static void main(String[] args){

int[] num = new int[5];
int counter;
int max = 0;

//for loop that gets the 5 numbers from the user 
for (counter = 0; counter < 5; counter++)
  {
   num[counter] = Integer.parseInt(JOptionPane.showInputDialog("Enter number "+(counter+1)));

//gets the maximum number
if((counter == 0) || (num [counter] > max))
max = num[counter];
}
//displays the number with the greatest number
JOptionPane.showMessageDialog (null, "The number with the greatest value is " + max);
}
}