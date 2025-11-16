package OOP;

public class Student {
	private String name;
    private int age;
    private int marks;

    Student(String name , int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void setName(String name){
        if(name != null && name.length()!=0)
            this.name = name;
        else
            System.out.println("Student name must not be Empty..!");
    }
    public void setAge(int age){
        if(age<0)
            System.out.println("Age Must be Greater than Zero...");
        else
            this.age = age;
    }
    public void setMarks(int marks){
        if(marks>100 || marks<0)
            System.out.println("Marks Must be bewteen 0 and 100");
        else
            this.marks = marks;
    }
    public String getString(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Student{Name: '" + name + "' ,Age: '" + age + "' ,Marks: '" + marks + "'}";
    }
}
