public class ZabalaFinLab1_2Num1 {
    
    public static void main(String[] args) {
    	
    	int value1=20;
    	int value2=30;
    	
    	 sum(value1, value2);
    	 diff(value1,value2);

    	int total=product(value1,value2);
    
   
    System.out.println("The product of the value is: " + total);
    }
    public static void sum(int num1, int num2)
    {
    	int sum=num1+num2;
    	System.out.println("The sum of the value is: " + sum);
  
    }
    public static void diff(int num1, int num2)
    {
        int diff= num1-num2;
        System.out.println("The diffrence of the value is: " + diff);
    }
    public static int product(int num1, int num2)
    {
    	int product=num1*num2;
    	return product;
    }
  }
