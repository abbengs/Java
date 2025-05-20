
 
public class Rectangle {
    
    //Writing the code of the class field
    private double length;
    private double width;
    
    //setting setLength method
    public void setLength(double length){
    	this.length = length;
    }
    
    //setting setWidth method
    public void setWidth(double width){
    	this.width = width;
    }
    
    //getting setLength method
    public double getLength(){
    	return length;
    }
    
    //getting setWidth method
    public double getWidth(){
    	return width;
    }
    
    //getting getArea method
    public double getArea(){
    	return length*width;
    	
    }
}
