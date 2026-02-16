package OOP;

public class Student extends Person implements Payable{
    private int marks;
    private long regNo;
    private String department;

    public Student(String name, int age, int marks, long regNo, String department) {
    super(name, age);
    this.marks = marks;
    this.regNo = regNo;
    this.department = department;
}


    @Override
    public void showRole(){
        System.out.println("Student..");
    }

    @Override
    public void payFees(){
        System.out.println("Student paid the fees successfully.");
    }

    public void setMarks(int marks){
        if(marks>100 || marks<0)
             throw new IllegalArgumentException("Marks must be between 0 and 100");
        else
            this.marks = marks;
    }

    public void setRegNo(long regNo){
        if(regNo < 0)
             throw new IllegalArgumentException("Wrong Reg No...");
        else
            this.regNo = regNo;
    }

    public void setDepartment(String department){
        if(department == null || department.trim().isEmpty()){
            throw new IllegalArgumentException("Department required");
        }
        this.department = department.trim();
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
        "Name = '" + getName() +
        "' , Age = '" + getAge() +
        "' , RegNo = '" + regNo + 
        "' , Marks = '" + marks + 
        "' , Department = '" + department +"'"
        + '}';
    }

   @Override
    public void displayInfo(){
        System.out.println("Student {" +
        "\n Name = '" + getName() + 
        "' \n Age = '" + getAge() +
        "' \n RegNo = '" + regNo +
        "' \n Marks = '" + marks +
        "'\n Department = '" + department + 
        "'\n }"
        );
    }
}
