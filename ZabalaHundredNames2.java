import java.io.*;

/**

* A program that prints a given name one hundred times

* using do-while loop
*/
public class ZabalaHundredNames2 {

public static void main(String[] args) {

BufferedReader reader = new BufferedReader(new InputStreamReader

(System.in));

String name = "";

int counter = 0;

//gets the users' name

try{

System.out.print("Enter name: ");

name = reader.readLine();

}catch(Exception e) {

System.out.println("Invalid input");

System.exit(0);

}

//do-while loop that prints the name one hundred times

do {

System.out.println(name);

counter++;

}while (counter < 100);

}

}