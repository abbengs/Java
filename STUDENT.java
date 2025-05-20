public class STUDENT {
    
    private String studentID;
    private String studentName;
    private String program;
    private int section;
    private double grade;
    
    public void setStudentID(String ID){
    	studentID = ID;
    }
    public void setStudentName(String Name){
    	studentName = Name;
    }
    public void setProgram(String Program){
    	program = Program;
    }
    public void setSection(int Section){
    	section = Section;
    }
    public void setGrade(double Grade){
    	grade = Grade;
    }
    public String getStudentID(){
    	return studentID;
    }
    public String getStudentName(){
    	return studentName;
    }
    public String getProgram(){
    	return program;
    }
    public int getSection(){
    	return section;
    }
    public double getGrade(){
    	return grade;
    }
    public static void main(String[] args){
    	
    	STUDENT name = new STUDENT();
    	name.setStudentID("M-100");
    	name.setStudentName("Abegail Zabala");
    	name.setProgram("BS Information Systems");
    	name.setSection(11);
    	name.setGrade(90.0);
    	
    	System.out.println("Name: " + name.getStudentName());
    	System.out.println("Student ID: " + name.getStudentID());
    	System.out.println("Program : " + name.getProgram());
    	System.out.println("Section: " + name.getSection());
    	System.out.println("Grade: " + name.getGrade());
    	
    }
}

