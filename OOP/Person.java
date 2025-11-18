package OOP;

public abstract class Person {
    protected String name;
    protected int age;

    public abstract void showRole();


    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    

    public void displayInfo(){
        System.out.println("Person {" +
        "\n Name = '" + name + 
        "' \n Age = '" + age +
        "' \n }"
        );
    }
    
}
