package OOP;

public class Student extends Person {
    private int marks;
    private long regNo;
    private String department;

    Student(int marks , long regNo , String department , String name , int age){
        super(name, age);
        this.marks = marks;
        this.department = department;
        this.regNo = regNo;
    }

    public void setMarks(int marks){
        if(marks>100 || marks<0)
            System.out.println("Marks Must be bewteen 0 and 100");
        else
            this.marks = marks;
    }

    public void setRegNo(long regNo){
        if(regNo < 0)
            System.out.println("Wrong Reg No...");
        else
            this.regNo = regNo;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public long getRegNo(){
        return regNo;
    }

    public String getDepartment(){
        return department;
    }

    public int getMarks(){
        return marks;
    }

    public String toString() {
        return "Student { " + 
        "Name = '" + name +
        "' , Age = '" + age +
        "' , RegNo = '" + regNo + 
        "' , Marks = '" + marks + 
        "' , Department = '" + department +"'"
        + '}';
    }

   @Override
    public void displayInfo(){
        System.out.println("Student {" +
        "\n Name = '" + name + 
        "' \n Age = '" + age +
        "' \n RegNo = '" + regNo +
        "' \n Marks = '" + marks +
        "'\n Department =' " + department + 
        "'\n }"
        );
    }
}
