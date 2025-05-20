
public class PersonClass {
    
  private int age;
  private String hairColor;
  
  public void setAge(int Age){
  	age = Age;
  }
  public void setHairColor(String colorHair){
  	hairColor = colorHair;
  }
  public int getAge(){
  	return age;
  }
  public String getHairColor(){
  	return hairColor;
  }
  public static void main(String[] agrs){
  	
  	PersonClass andrei = new PersonClass();
  	PersonClass andrix = new PersonClass();
  	
  	andrei.setAge(24);
  	andrei.setHairColor("Black");
  	andrix.setAge(13);
  	andrix.setHairColor("Blonde");
  	
  	System.out.println("Andrei's age is " + andrei.getAge() + " and his hair color is " + andrei.getHairColor());
  	System.out.println("Andrix's age is " + andrix.getAge() + " and his hair color is " + andrix.getHairColor());
  }
}
