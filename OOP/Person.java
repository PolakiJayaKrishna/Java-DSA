package OOP;

public abstract class Person {
    private  String name;
    private  int age;

    public abstract void showRole();


    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
    if(name == null || name.trim().isEmpty()){
        throw new IllegalArgumentException("Name required");
    }
    this.name = name.trim();
    }


    public void setAge(int age){
    if(age <= 0){
        throw new IllegalArgumentException("Age must be greater than 0");
    }
    this.age = age;
}


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void displayInfo(){
        System.out.println("Person {" +
        "\n Name = '" + name + 
        "' \n Age = '" + age +
        "' \n }"
        );
    }
    
}
