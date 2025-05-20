import java.io.*;

/**

* A program that prints a given name one hundred times

using for loop

*/

public class ZabalaHundredNames3

{

public static void main(String[] args) {

BufferedReader reader = new BufferedReader(new InputStreamReader

(System.in));

String name = "";

//gets the users' name

try{

System.out.print("Enter name: ");

name = reader.readLine();

} catch (Exception e) {

System.out.println("Invalid input");

System.exit(0);

}

//for loop that prints the name one hundred times

for (int counter = 0; counter < 100; counter++) {

System.out.println(name);

}

}

}