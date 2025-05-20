public class ZabalaEmployee {
    
   private String name;
   private int iD;
   private String position;
   
   public ZabalaEmployee(String name, int iD, String position){
   	
   	this.name = name;
   	this.iD = iD;
   	this.position = position;
   }
   public void displayDetails(){
   	System.out.println("Name: " + name);
   	System.out.println("ID: " + iD);
   	System.out.println("Position: " + position);
   }
}

class main{
	public static void main(String[] args){
		
		System.out.println("Employee Details");
		System.out.println();
		ZabalaEmployee employeeNum1 = new ZabalaEmployee("Melissa Brina", 1993, "Manager");
		ZabalaEmployee employeeNum2 = new ZabalaEmployee("Airish Postrado", 2002, "Chief financial officer");
		ZabalaEmployee employeeNum3 = new ZabalaEmployee("Vanessa Largosa", 1994, "Chief Marketing officer");
		ZabalaEmployee employeeNum4 = new ZabalaEmployee("Dianne Rosema", 2003, "Sales Representative");
		
		employeeNum1.displayDetails();
		System.out.println();
		employeeNum2.displayDetails();
		System.out.println();
		employeeNum3.displayDetails();
		System.out.println();
		employeeNum4.displayDetails();
	}
}




