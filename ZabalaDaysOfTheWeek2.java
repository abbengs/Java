/** 
*Uses an array string to save the days of the wee
*then prints it on the screen with a do-while loop.
*/
public class ZabalaDaysOfTheWeek2{

public static void main(String[] args){

//declares the String array of the days of the week

String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 
int counter = 0;

//do-while loop that prints the days of the week

do
{
System.out.println(days [counter]);
counter++;
}
while (counter < days.length);
}
}


