import javax.swing.JOptionPane;

/**

Computes the power of a number given the base and the exponent.

The exponent is limited to positive numbers only.

*/

public class ZabalaPower3 {

public static void main(String[] args) {

int base = 0;

int exp = 0;

int power = 1;

int counter = 0;

//gets the user input for base and power using JOptionPane

base = Integer.parseInt(JOptionPane.showInputDialog("Base"));

exp = Integer.parseInt(JOptionPane.showInputDialog("Exponent"));

//limits the exp to positive numbers only

if (exp < 0) {

JOptionPane.showMessageDialog(null, "Positive numbers only please");

System.exit(0);

}

//for loop for computing the power

for (counter -= 0; counter < exp; counter++) {

power = power*base;

}

//displays the result

JOptionPane.showMessageDialog(null, base+" to the "+exp+" is "+power);

}

}