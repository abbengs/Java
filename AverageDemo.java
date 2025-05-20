
public class AverageDemo{

 public static void main(String args[]){
    	
    	//Create an Average object
    	Average avg = new Average();
    	
    	//Set numbers 1,2,3
    	avg.setNumber1(10.0);
    	avg.setNumber2(15.0);
    	avg.setNumber3(20.0);
    	
    	//Display the number1
    	System.out.println("The first number is " + avg.getNumber1());
    	
    	//Display the number2
    	System.out.println("The second number is " + avg.getNumber2());
    	
    	//Display the number3
    	System.out.println("The third number is " + avg.getNumber3());
    	
    	//Display the average
    	System.out.println("\nThe average of the three number is " + avg.getAverage());
    }
}
