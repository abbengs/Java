public class Average {
    
    private double num1;
    private double num2;
    private double num3;
    
    public void setNumber1(double n1){
    	num1=n1;
    }
    public void setNumber2(double n2){
    	num2=n2;
    }
    public void setNumber3(double n3){
    	num3=n3;
    }
    
    public double getNumber1(){
    	return num1;
    }
    public double getNumber2(){
    	return num2;
    }
    public double getNumber3(){
    	return num3;
    }
    
    public double getAverage(){
    	
    	double sum = num1+num2+num3;
    	double avg = sum/3;
    	return avg;
    }
}
   