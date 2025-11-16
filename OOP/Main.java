package OOP;

public class Main {
    public static void main(String[] args) {

        // Create a student object using constructor
        Student s1 = new Student("Jay", 21, 90);

        // Print the student object
        System.out.println(s1);

        // Test setters
        s1.setName("Jai Krishna");
        s1.setAge(22);
        s1.setMarks(95);

        // Print again to check changes
        System.out.println(s1);
    }
}
